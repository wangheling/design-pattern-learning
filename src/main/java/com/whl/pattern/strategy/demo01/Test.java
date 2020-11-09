package com.whl.pattern.strategy.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/9 10:34
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        double price = context.getPrice(2, 100D);
        System.out.println(price);
        double price1 = context.getPrice(1, 100D);
        System.out.println(price1);
    }
}
