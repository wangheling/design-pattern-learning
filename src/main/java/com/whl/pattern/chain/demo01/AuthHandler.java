package com.whl.pattern.chain.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/7 21:27
 * @Description:
 */
public class AuthHandler extends AbstractHandler {

    @Override
    public void doHandler(String account,String password) {
        System.out.println("权限校验通过");
        nextHandler.doHandler(account,password);
    }
}
