package com.whl.pattern.state.demo02;

import java.util.concurrent.TimeUnit;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/13 15:53
 */
public class SpeedUpRunState implements RunState {
    @Override
    public void run(Hero hero) {

        try {
            System.out.println("加速状态，速度为150，持续1秒");
            TimeUnit.SECONDS.sleep(1L);
            System.out.println("加速状态，速度为150，持续2秒");
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("加速结束，恢复正常速度");
        //恢复正常状态
        hero.setRunState(Hero.NOMAL);

    }
}
