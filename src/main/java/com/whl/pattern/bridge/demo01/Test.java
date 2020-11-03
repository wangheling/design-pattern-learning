package com.whl.pattern.bridge.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/3 17:38
 */
public class Test {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.setColor(new RedColor());
        System.out.println(wallet.getName());
        wallet.setColor(new BlackColor());
        System.out.println(wallet.getName());

        HandBag handBag  = new HandBag();
        handBag.setColor(new BlackColor());
        System.out.println(handBag.getName());
        handBag.setColor(new RedColor());
        System.out.println(handBag.getName());

    }
}
