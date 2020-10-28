package com.whl.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 17:35
 */
public class DynamicProxySubject implements InvocationHandler {

    private Subject target;

//    public DynamicProxySubject(Object target) {
//        this.target = target;
//    }

    public Subject getProxy(Subject target) {
        this.target = target;
        Class<? extends Subject> clazz = target.getClass();
        return (Subject) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类执行前置方法");
        Object result = method.invoke(target, args);
        System.out.println("代理类执行后置方法");
        return result;
    }
}
