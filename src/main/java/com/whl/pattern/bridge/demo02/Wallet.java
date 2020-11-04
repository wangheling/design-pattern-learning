package com.whl.pattern.bridge.demo02;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/4 9:33
 */
public class Wallet extends AbstractBag {

    public Wallet(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor() + "钱包";
    }
}
