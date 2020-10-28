package com.whl.pattern.facade.demo01;

/**
 * @Author: heling
 * @Date: 2020/10/28 22:48
 * @Description:
 */
public class Facade {


    public void invokeAService() {
        new AService().invokeAMethod();
    }

    public void invokeBService() {
        new BService().invokeBMethod();
    }

}
