package com.whl.pattern.factory.simplefactory;

/**
 * @Desc：简单工厂
 * @Author: heling
 * @Date: 2020/10/23 10:18
 */
public class Test {

    public static void main(String[] args) {

        //工厂类只需传入参数，不关心如何创建对象
        IProduct a = ProductFactory.createProduct("A");
        a.method();

        IProduct b = ProductFactory.createProduct("B");
        b.method();
    }
}
