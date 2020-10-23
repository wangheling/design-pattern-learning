package com.whl.pattern.factory.abstractfactory.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 15:10
 */
public class Test {

    public static void main(String[] args) {
        SmartPhoneFactory smartPhoneFactory = new SmartPhoneFactory();
        smartPhoneFactory.createAppleBrand().produce();
        smartPhoneFactory.createHuaweiBrand().produce();

        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createAppleBrand().produce();
        computerFactory.createHuaweiBrand().produce();
    }
}
