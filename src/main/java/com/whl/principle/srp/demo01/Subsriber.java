package com.whl.principle.srp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 13:26
 */
public interface Subsriber {
    void subsribe();
    void consume(String msg);
}
