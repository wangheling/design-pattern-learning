package com.whl.pattern.bridge.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/3 17:35
 */
public class Wallet extends Bag {

    @Override
    public String getName() {
        return color.getColor() + "钱包";
    }
}
