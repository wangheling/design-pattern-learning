package com.whl.principle.srp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 13:32
 */
public class CouponServiceImpl implements CouponService {

    @Override
    public void gift(String userName) {
        System.out.println("给用户" + userName + "下方优惠券");
    }

    @Override
    public void subsribe() {
        SubscribeSystem.subsribe(this);
    }

    @Override
    public void consume(String msg) {
        gift(msg);
    }
}
