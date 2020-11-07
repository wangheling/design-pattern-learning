package com.whl.pattern.chain.demo01;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: heling
 * @Date: 2020/11/7 21:29
 * @Description:
 */
public class BlackListHandler extends AbstractHandler {

    private static final Set<String> blackList = new HashSet<>();

    static {
        blackList.add("zhangsan");
        blackList.add("wangwu");
    }


    @Override
    public void doHandler(String account, String password) {

        if (blackList.contains(account)) {
            System.out.println(account + "在黑名单中，不能登录");
            return;
        }
        nextHandler.doHandler(account,password);
    }
}
