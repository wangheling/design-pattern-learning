package com.whl.pattern.decorator.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/29 10:38
 */
public interface ICache {

    void put(String key, String value);

    String get(String key);

    void del(String key);

    int size();
}
