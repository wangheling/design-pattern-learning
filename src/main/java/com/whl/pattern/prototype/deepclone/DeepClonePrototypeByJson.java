package com.whl.pattern.prototype.deepclone;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: heling
 * @Date: 2020/10/25 11:18
 * @Description: 深拷贝：转Json方式
 */
@Data
public class DeepClonePrototypeByJson implements Cloneable {

    private String name;
    private int age;
    private List<String> hobbies;

    @Override
    public DeepClonePrototypeByJson clone() {
        try {
            return (DeepClonePrototypeByJson) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


    public DeepClonePrototypeByJson deepClone() {
        try {
            String s = JSONObject.toJSONString(this);
            return JSONObject.parseObject(s, DeepClonePrototypeByJson.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        DeepClonePrototypeByJson o = new DeepClonePrototypeByJson();
        o.setName("heling");
        o.setAge(18);
        List<String> hobbies = new ArrayList<>();
        hobbies.add("java");
        o.setHobbies(hobbies);
        System.out.println("原型为：" + o);
        DeepClonePrototypeByJson clone = o.deepClone();
        System.out.println("克隆后新对象为：" + clone);
        clone.getHobbies().add("python");
        System.out.println("原型为：" + o);
        System.out.println("克隆后新对象为：" + clone);
    }
}
