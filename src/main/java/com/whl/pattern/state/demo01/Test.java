package com.whl.pattern.state.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/12 16:18
 */
public class Test {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.like("《Java从入门到放弃》");
        context.comment("《Java从入门到放弃》","very good");
    }

}
