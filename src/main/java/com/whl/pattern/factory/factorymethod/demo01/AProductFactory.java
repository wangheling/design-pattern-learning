package com.whl.pattern.factory.factorymethod.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 14:26
 */
public class AProductFactory implements ProductFactory {
    @Override
    public IProduct createProduct() {
        return new AProduct();
    }
}
