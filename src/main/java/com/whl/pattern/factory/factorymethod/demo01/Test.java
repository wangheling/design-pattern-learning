package com.whl.pattern.factory.factorymethod.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 14:27
 */
public class Test {

    public static void main(String[] args) {
        ProductFactory factory = new AProductFactory();
        IProduct product = factory.createProduct();
        product.method();
        factory = new BProductFactory();
        product = factory.createProduct();
        product.method();
        // 每新增一个产品，则新加一个IProduct类，一个ProductFactory类，符合开闭原则
    }
}
