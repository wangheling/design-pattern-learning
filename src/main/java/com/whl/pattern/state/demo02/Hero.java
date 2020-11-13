package com.whl.pattern.state.demo02;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/13 15:54
 */
public class Hero {

    private Thread runThread;

    //正常状态
    public static final RunState NOMAL = new NomalRunState();
    //加速状态
    public static final RunState SPEED_UP = new SpeedUpRunState();
    //减速状态
    public static final RunState SLOW_DOWN = new SlowDownRunState();
    //静止状态
    public static final RunState STOP = new StopRunState();

    //当前英雄移动状态
    private RunState current = NOMAL;

    //设置英雄移动状态
    public void setRunState(RunState runState) {
        this.current = runState;
    }

    public void startRun() {
        System.out.println("================开始移动================");
        final Hero hero = this;
        runThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    current.run(hero);
                }
            }
        });
        runThread.start();
    }

}
