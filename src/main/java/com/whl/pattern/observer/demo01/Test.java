package com.whl.pattern.observer.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/13 15:12
 */
public class Test {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.addObserver(new AObserver());
        publisher.addObserver(new BObserver());
        publisher.change();
    }
}
