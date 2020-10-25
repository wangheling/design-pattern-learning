package com.whl.pattern.prototype.deepclone;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: heling
 * @Date: 2020/10/25 11:18
 * @Description: 深拷贝：序列化方式
 */
@Data
public class DeepClonePrototypeBySerializable implements Cloneable, Serializable {

    private String name;
    private int age;
    private List<String> hobbies;

    @Override
    public DeepClonePrototypeBySerializable clone() {
        try {
            return (DeepClonePrototypeBySerializable) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


    public DeepClonePrototypeBySerializable deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (DeepClonePrototypeBySerializable) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        DeepClonePrototypeBySerializable o = new DeepClonePrototypeBySerializable();
        o.setName("heling");
        o.setAge(18);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("java");
        o.setHobbies(hobbies);
        System.out.println("原型为：" + o);
        DeepClonePrototypeBySerializable clone = o.deepClone();
        System.out.println("克隆后新对象为：" + clone);
        clone.getHobbies().add("python");
        System.out.println("原型为：" + o);
        System.out.println("克隆后新对象为：" + clone);
    }
}
