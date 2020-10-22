package com.whl.principle.ocp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 10:13
 */
public class DiscountAppleOne extends Apple {

    public DiscountAppleOne(String name, Double price) {
        super(name, price);
    }

    public Double getDiscountPrice() {
        return 0.9 * super.getPrice();
    }
}
