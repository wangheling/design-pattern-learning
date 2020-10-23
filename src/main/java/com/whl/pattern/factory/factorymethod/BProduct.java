package com.whl.pattern.factory.factorymethod;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 10:15
 */
public class BProduct implements IProduct {
    @Override
    public void method() {
        System.out.println("B产品的方法");
    }
}
