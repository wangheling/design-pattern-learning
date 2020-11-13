package com.whl.pattern.state.demo02;

/**
 * @Desc：英雄移动状态
 * @Author: heling
 * @Date: 2020/11/13 15:45
 */
public interface RunState {

    /**
     *
     * @desc:
     * @param: hero 传递状态
     * @return:
     * @author: heling
     */
    void run(Hero hero);
}
