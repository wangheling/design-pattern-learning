package com.whl.pattern.singleton.hungry;

/**
 * @Author: heling
 * @Date: 2020/10/24 17:52
 * @Description: 饿汉式
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }


    public static HungrySingleton getInstance() {
        return instance;
    }


    public static void main(String[] args) {
            System.out.println(HungrySingleton.getInstance());
            System.out.println(HungrySingleton.getInstance());
//        com.whl.pattern.singleton.hungry.HungrySingleton@1540e19d
//        com.whl.pattern.singleton.hungry.HungrySingleton@1540e19d
//        打印地址一样
    }


}
