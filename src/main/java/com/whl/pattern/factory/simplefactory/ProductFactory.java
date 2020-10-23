package com.whl.pattern.factory.simplefactory;

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
        return null;

    }
}
