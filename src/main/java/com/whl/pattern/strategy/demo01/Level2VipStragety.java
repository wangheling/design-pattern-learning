package com.whl.pattern.strategy.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/9 10:28
 */
public class Level2VipStragety implements SaleStrategy {
    @Override
    public double getPrice(double orginPrice) {
        return 0.8 * orginPrice;
    }
}
