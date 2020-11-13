package com.whl.pattern.observer.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/13 15:00
 */
public class AObserver extends Observer  {

    @Override
    void notifyObserver() {
        System.out.println("监听到消息，更新操作");
    }
}
