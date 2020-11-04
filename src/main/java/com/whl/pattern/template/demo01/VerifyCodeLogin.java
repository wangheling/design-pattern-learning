package com.whl.pattern.template.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/4 22:41
 * @Description:
 */
public class VerifyCodeLogin extends AbstractLoginService {
    @Override
    public void vertify() {
        System.out.println("第二步：输入手机动态验证码");
    }
}
