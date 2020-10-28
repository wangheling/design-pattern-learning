package com.whl.pattern.proxy.staticproxy;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 17:24
 */
public class TargetSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("do something ......");
    }
}
