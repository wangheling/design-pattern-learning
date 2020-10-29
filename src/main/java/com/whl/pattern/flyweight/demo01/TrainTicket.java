package com.whl.pattern.flyweight.demo01;

import java.util.Random;

/**
 * @Author: heling
 * @Date: 2020/10/29 21:29
 * @Description:
 */
public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(from + "->" + to + ":" + bunk + "价格：" + price);
    }
}
