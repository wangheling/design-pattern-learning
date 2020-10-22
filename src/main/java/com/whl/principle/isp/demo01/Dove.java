package com.whl.principle.isp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 11:18
 */
public class Dove implements Animal,Bird {
    @Override
    public void eat() {
        System.out.println("鸽子吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("鸽子睡觉");
    }

    @Override
    public void fly() {
        System.out.println("鸽子会飞翔");
    }
}
