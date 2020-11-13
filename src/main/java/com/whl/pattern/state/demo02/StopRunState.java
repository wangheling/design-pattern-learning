package com.whl.pattern.state.demo02;

import java.util.concurrent.TimeUnit;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/13 15:53
 */
public class StopRunState implements RunState {
    @Override
    public void run(Hero hero) {
        try {
            System.out.println("静止状态，速度为0，持续1秒");
            TimeUnit.SECONDS.sleep(1L);
            System.out.println("静止状态，速度为0，持续2秒");
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("静止结束，恢复正常速度");
        //恢复正常状态
        hero.setRunState(Hero.NOMAL);
    }
}
