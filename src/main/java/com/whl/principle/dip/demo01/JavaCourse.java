package com.whl.principle.dip.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 15:18
 */
public class JavaCourse implements Course {
    @Override
    public void study() {
        System.out.println("学习Java");
    }
}
