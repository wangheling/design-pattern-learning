package com.whl.pattern.observer.demo01;

import java.util.HashSet;
import java.util.Set;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/13 15:02
 */
public class Publisher {
    public static final Set<Observer> OBSERVER_SET = new HashSet<>();

    public void addObserver(Observer observer) {
        OBSERVER_SET.add(observer);
    }


    public  void change() {
        System.out.println("更新动作,发送更新消息");
        notifyObservers();
    }

    private  void notifyObservers() {
        for (Observer observer : OBSERVER_SET) {
            observer.notifyObserver();
        }
    }

}
