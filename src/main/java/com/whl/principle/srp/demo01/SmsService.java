package com.whl.principle.srp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 13:29
 */
public interface SmsService extends Subsriber {

    void sendSms(String userName);

}
