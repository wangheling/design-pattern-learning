package com.whl.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 17:39
 */
public class Test {
    public static void main(String[] args) {
        TargetSubject targetSubject = new TargetSubject();
        InvocationHandler invocationHandler = new DynamicProxySubject(targetSubject);
        Subject o = (Subject) Proxy.newProxyInstance(targetSubject.getClass().getClassLoader(), targetSubject.getClass().getInterfaces(), invocationHandler);
        o.doSomething();

        TargetSubject2 targetSubject2 = new TargetSubject2();
        InvocationHandler invocationHandler2 = new DynamicProxySubject(targetSubject2);
        Subject o2 = (Subject) Proxy.newProxyInstance(targetSubject2.getClass().getClassLoader(), targetSubject2.getClass().getInterfaces(), invocationHandler2);
        o2.doSomething();
    }
}
