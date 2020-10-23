package com.whl.pattern.factory.simplefactory.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 10:16
 */
public class ProductFactory {

    public static IProduct createProduct(String productName) {

        if ("a".equalsIgnoreCase(productName)) {
            return new AProduct();
        }
        if ("b".equalsIgnoreCase(productName)) {
            return new BProduct();
        }
        // 每增加一个产品，都需要在这里新增代码，不符合开闭原则
        return null;

    }
}
