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
        DynamicProxySubject dynamicProxySubject = new DynamicProxySubject();
        Subject proxy = dynamicProxySubject.getProxy(new TargetSubject());
        proxy.doSomething();
        Subject proxy2 = dynamicProxySubject.getProxy(new TargetSubject2());
        proxy2.doSomething();
    }
}
