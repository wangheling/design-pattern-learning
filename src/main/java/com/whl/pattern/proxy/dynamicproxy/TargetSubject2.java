package com.whl.pattern.proxy.dynamicproxy;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 17:24
 */
public class TargetSubject2 implements Subject {
    @Override
    public void doSomething() {
        System.out.println("做某些事情 ......");
    }
}
