package com.whl.pattern.facade.demo01;

/**
 * @Author: heling
 * @Date: 2020/10/28 22:49
 * @Description:
 */
public class Client {


    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.invokeAService();
        facade.invokeBService();
    }

}
