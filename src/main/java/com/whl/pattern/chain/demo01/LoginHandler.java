package com.whl.pattern.chain.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/7 21:29
 * @Description:
 */
public class LoginHandler extends AbstractHandler {
    @Override
    public void doHandler(String account, String password) {
        System.out.println(account + "登录成功");
    }
}
