package com.whl.pattern.bridge.demo02;


import javax.sound.midi.Soundbank;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/4 9:36
 */
public class Test {
    public static void main(String[] args) {
        Color color = new RedColor();
        HandBag handBag = new HandBag(color);
        System.out.println(handBag.getName());
        Wallet wallet = new Wallet(color);
        System.out.println(wallet.getName());

    }
}
