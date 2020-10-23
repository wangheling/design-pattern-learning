package com.whl.pattern.factory.abstractfactory.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/23 15:08
 */
public class SmartPhoneFactory implements Factory {
    @Override
    public AppleBrand createAppleBrand() {
        return new IphoneSmartPhone();
    }

    @Override
    public HuaweiBrand createHuaweiBrand() {
        return new HuaweiSmartPhone();
    }
}
