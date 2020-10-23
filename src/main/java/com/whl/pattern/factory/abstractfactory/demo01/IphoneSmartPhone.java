package com.whl.pattern.factory.abstractfactory.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 15:03
 */
public class IphoneSmartPhone implements AppleBrand {
    @Override
    public void produce() {
        System.out.println("Apple牌生产iphone");
    }
}
