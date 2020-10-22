package com.whl.principle.interfacesegregation.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 11:19
 */
public class Test {
    public static void main(String[] args) {

        //不要在Animal里定义fly()和swim()方法，不然Bird还得实现swim()方法。
        // 所以定义Bird接口定义fly()方法，Fish接口定义swim()方法。

        GoldFish goldFish = new GoldFish();
        goldFish.eat();
        goldFish.sleep();
        goldFish.swim();

        System.out.println("=======================");

        Dove dove = new Dove();
        dove.eat();
        dove.sleep();
        dove.fly();
    }
}
