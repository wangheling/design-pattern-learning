package com.whl.pattern.decorator.demo01;

import java.util.HashMap;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/29 10:39
 */
public class Cache implements ICache {

    private final HashMap<String,String> map = new HashMap<>();

    @Override
    public void put(String key, String value) {
        map.put(key,value);
    }

    @Override
    public String get(String key) {
        return map.get(key);
    }

    @Override
    public void del(String key) {
        map.remove(key);
    }

    @Override
    public int size() {
        return map.size();
    }
}
