package com.whl.pattern.delegate.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/4 21:31
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.delegateTask("打印资料");
        boss.delegateTask("准备会议");
    }
}
