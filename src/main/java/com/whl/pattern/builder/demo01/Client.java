package com.whl.pattern.builder.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 10:01
 */
public class Client {

    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder().buildBrand("huawei").buildColor("黑色").buildMemory("6G");
        Phone phone = phoneBuilder.build();
        System.out.println(phone);
    }

}
