package com.whl.principle.ocp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 10:07
 */
public class Test {

    public static void main(String[] args) {
        Apple apple = new Apple("a品种", 5.00D);
        System.out.println(apple.getName() + "苹果原价为" + apple.getPrice() +"元");

        //开闭原则，不修改Apple类，而是新加类
        DiscountAppleOne apple2 = new DiscountAppleOne(apple.getName(), apple.getPrice());
        System.out.println(apple2.getName() + "苹果折扣价1为" + apple2.getDiscountPrice() +"元");

        DiscountAppleTwo apple3 = new DiscountAppleTwo(apple.getName(), apple.getPrice());
        System.out.println(apple3.getName() + "苹果折扣价2为" + apple3.getDiscountPrice() +"元");
    }
}
