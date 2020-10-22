package com.whl.principle.srp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 13:48
 */
public class Test {

    public static void main(String[] args) {
        CouponServiceImpl couponService = new CouponServiceImpl();
        couponService.subsribe();

        SmsServiceImpl smsService = new SmsServiceImpl();
        smsService.subsribe();

        RegistryServiceImpl registryService = new RegistryServiceImpl();
        registryService.registryUser("heling","123456");
    }

}
