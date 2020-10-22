package com.whl.principle.ocp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 10:13
 */
public class DiscountAppleTwo extends Apple {

    public DiscountAppleTwo(String name, Double price) {
        super(name, price);
    }

    public Double getDiscountPrice() {
        return 0.8 * super.getPrice();
    }
}
