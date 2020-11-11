package com.whl.pattern.command.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/11 10:34
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("发布命令" + command.toString());
        command.execute();
    }



}
