package com.whl.pattern.delegate.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/4 21:07
 * @Description:
 */
public class AEmploee implements Emploee {
    @Override
    public void doTask() {
        System.out.println("安排A员工打印资料");
    }
}
