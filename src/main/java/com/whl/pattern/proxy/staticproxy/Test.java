package com.whl.pattern.proxy.staticproxy;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 17:27
 */
public class Test {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.doSomething();
    }
}
