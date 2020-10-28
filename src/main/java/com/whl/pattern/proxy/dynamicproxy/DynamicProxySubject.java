package com.whl.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 17:35
 */
public class DynamicProxySubject implements InvocationHandler {

    private Object target;

    public DynamicProxySubject(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类执行前置方法");
        Object result = method.invoke(target, args);
        System.out.println("代理类执行后置方法");
        return result;
    }
}
