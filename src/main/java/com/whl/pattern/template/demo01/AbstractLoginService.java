package com.whl.pattern.template.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/4 22:38
 * @Description:
 */
public abstract class AbstractLoginService {


    public void login() {
        System.out.println("第一步：输入手机号");

        vertify();

        System.out.println("第三步：展示登录成功欢迎页");
    }

    public abstract void vertify();


}
