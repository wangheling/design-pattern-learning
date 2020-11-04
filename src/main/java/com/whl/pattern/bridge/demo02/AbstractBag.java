package com.whl.pattern.bridge.demo02;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/4 9:31
 */
public abstract class AbstractBag {

    protected Color color;

    public AbstractBag(Color color) {
        this.color = color;
    }

    public abstract String getName();

}
