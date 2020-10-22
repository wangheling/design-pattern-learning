package com.whl.principle.isp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 11:17
 */
public class GoldFish implements Animal,Fish {
    @Override
    public void eat() {
        System.out.println("金鱼吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("金鱼睡觉");
    }

    @Override
    public void swim() {
        System.out.println("金鱼会游泳");
    }
}
