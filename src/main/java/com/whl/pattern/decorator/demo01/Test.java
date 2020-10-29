package com.whl.pattern.decorator.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/29 11:01
 */
public class Test {
    public static void main(String[] args) {
        RateStaticsCache cache = new RateStaticsCache(new FifoCache(new Cache()));
        for (int i = 0; i < 10; i++) {
            cache.put(i + "",i+ "");
        }

        for (int i = 0; i < 10; i++) {
            cache.get(i + "");
        }
    }
}
