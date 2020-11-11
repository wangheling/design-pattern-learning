package com.whl.pattern.command.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/11 10:37
 */
public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ACommand());
        invoker.call();
    }
}
