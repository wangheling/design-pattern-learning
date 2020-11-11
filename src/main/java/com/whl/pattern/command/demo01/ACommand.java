package com.whl.pattern.command.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/11 10:33
 */
public class ACommand implements Command {

    private Receiver receiver;

    public ACommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public String toString() {
        return "A命令";
    }
}
