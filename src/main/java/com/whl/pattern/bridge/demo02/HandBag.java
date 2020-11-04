package com.whl.pattern.bridge.demo02;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/4 9:33
 */
public class HandBag extends AbstractBag {

    public HandBag(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return color.getColor() + "手提包";
    }
}
