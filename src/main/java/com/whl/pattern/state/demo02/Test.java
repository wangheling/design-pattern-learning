package com.whl.pattern.state.demo02;

import java.util.concurrent.TimeUnit;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/13 16:06
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        hero.startRun();

        TimeUnit.SECONDS.sleep(4L);

        System.out.println("==============英雄加速===================");

        hero.setRunState(Hero.SPEED_UP);

        TimeUnit.SECONDS.sleep(4L);

        System.out.println("==============英雄被禁锢===================");

        hero.setRunState(Hero.STOP);

        TimeUnit.SECONDS.sleep(4L);

        System.out.println("==============英雄被减速===================");

        hero.setRunState(Hero.SLOW_DOWN);

    }
}
