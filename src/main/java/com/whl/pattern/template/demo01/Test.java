package com.whl.pattern.template.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/4 22:43
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("账号密码登录方式");
        new PasswordLogin().login();
        new PasswordLogin().vertify();

        System.out.println("======================");


        System.out.println("手机验证码登录方式");
        new VerifyCodeLogin().login();
    }
}
