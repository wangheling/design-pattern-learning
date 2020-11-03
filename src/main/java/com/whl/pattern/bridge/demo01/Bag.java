package com.whl.pattern.bridge.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/3 17:32
 */
public abstract class Bag {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
