package com.whl.pattern.factory.abstractfactory.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 15:03
 */
public class MacBookComputer implements AppleBrand {
    @Override
    public void produce() {
        System.out.println("Apple牌生产MacBook");
    }
}
