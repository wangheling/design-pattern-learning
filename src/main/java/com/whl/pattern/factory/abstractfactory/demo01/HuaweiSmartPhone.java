package com.whl.pattern.factory.abstractfactory.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 15:02
 */
public class HuaweiSmartPhone implements HuaweiBrand {
    @Override
    public void produce() {
        System.out.println("华为牌生产华为手机");
    }
}
