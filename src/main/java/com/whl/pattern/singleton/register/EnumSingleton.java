package com.whl.pattern.singleton.register;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @Author: heling
 * @Date: 2020/10/24 21:17
 * @Description: 枚举式单例
 *
 * 防止反射破坏
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;


    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        EnumSingleton instance2 = EnumSingleton.getInstance();
        instance.setData(new Object());
        System.out.println(instance.getData());
        System.out.println(instance2.getData());


    }
}
