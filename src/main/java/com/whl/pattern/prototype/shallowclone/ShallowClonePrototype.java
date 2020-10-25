package com.whl.pattern.prototype.shallowclone;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: heling
 * @Date: 2020/10/25 11:18
 * @Description: 浅拷贝
 */
@Data
public class ShallowClonePrototype implements Cloneable {

    private String name;
    private int age;
    private List<String> hobbies;

    @Override
    public ShallowClonePrototype clone() {
        try {
            return  (ShallowClonePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 修改克隆后对象，原型对象的属性页被修改了。他们指向同一内存地址，是浅克隆
     * @param args
     */
    public static void main(String[] args) {
        ShallowClonePrototype o = new ShallowClonePrototype();
        o.setName("heling");
        o.setAge(18);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("java");
        o.setHobbies(hobbies);
        System.out.println("原型为：" + o);
        ShallowClonePrototype clone = o.clone();
        System.out.println("克隆后新对象为：" + clone);
        clone.getHobbies().add("python");
        System.out.println("原型为：" + o);
        System.out.println("克隆后新对象为：" + clone);
    }
}
