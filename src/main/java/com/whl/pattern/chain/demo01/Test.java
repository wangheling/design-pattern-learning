package com.whl.pattern.chain.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/7 21:35
 * @Description:
 */
public class Test {

//    public static void main(String[] args) {
//        BlackListHandler handler = new BlackListHandler();
//        AuthHandler authHandler = new AuthHandler();
//        LoginHandler loginHandler = new LoginHandler();
//        handler.setNextHandler(authHandler);
//        authHandler.setNextHandler(loginHandler);
//
//
//        handler.doHandler("zhangsan","123456");
//
//        System.out.println("===============================");
//
//        handler.doHandler("heling","123456");
//    }

    public static void main(String[] args) {
        AbstractHandler.Builder<Object> builder = new AbstractHandler.Builder<>();
        builder.addHandler(new BlackListHandler())
                .addHandler(new AuthHandler())
                .addHandler(new LoginHandler());
        AbstractHandler<Object> headHandler = builder.build();
        headHandler.doHandler("heling","123456");
        System.out.println("===========================================");
        headHandler.doHandler("zhangsan","123456");
    }
}
