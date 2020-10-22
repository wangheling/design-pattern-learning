package com.whl.principle.lsp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 16:43
 */
public class Child extends Parent {

    @Override
    public int method(int a, int b) {
        return a - b;
    }

    public int method2(int a, int b) {
        return a * b;
    }

}
