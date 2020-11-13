package com.whl.pattern.state.demo02;

import java.util.concurrent.TimeUnit;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/13 15:53
 */
public class NomalRunState implements RunState {
    @Override
    public void run(Hero hero) {
        System.out.println("正常移动，速度为100");
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
