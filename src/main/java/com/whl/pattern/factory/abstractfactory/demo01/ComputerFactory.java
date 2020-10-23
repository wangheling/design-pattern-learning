package com.whl.pattern.factory.abstractfactory.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 15:08
 */
public class ComputerFactory implements Factory {
    @Override
    public AppleBrand createAppleBrand() {
        return new MacBookComputer();
    }

    @Override
    public HuaweiBrand createHuaweiBrand() {
        return new HuaweiComputer();
    }
}
