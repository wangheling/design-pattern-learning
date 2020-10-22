package com.whl.principle.srp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 13:31
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public void sendSms(String userName) {
        System.out.println("给用户" + userName + "发送注册成功短信");
    }

    @Override
    public void subsribe() {
        SubscribeSystem.subsribe(this);
    }

    @Override
    public void consume(String msg) {
        sendSms(msg);
    }
}
