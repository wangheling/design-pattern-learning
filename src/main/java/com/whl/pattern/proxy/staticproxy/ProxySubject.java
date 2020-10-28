package com.whl.pattern.proxy.staticproxy;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 17:25
 */
public class ProxySubject implements Subject {

    private TargetSubject targetSubject;

    @Override
    public void doSomething() {
        System.out.println("代理类执行前置方法");
        targetSubject = new TargetSubject();
        targetSubject.doSomething();
        System.out.println("代理类执行后置方法");
    }
}
