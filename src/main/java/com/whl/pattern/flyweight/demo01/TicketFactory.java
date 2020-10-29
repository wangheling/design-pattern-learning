package com.whl.pattern.flyweight.demo01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: heling
 * @Date: 2020/10/29 21:32
 * @Description:
 */
public class TicketFactory {

    private static Map<String,ITicket> pool = new ConcurrentHashMap<>();


    public static ITicket queryTicket(String from, String to) {
        String key = from + "->" + to;
        if (pool.containsKey(key)) {
            System.out.println("使用缓存：" + key);
            return pool.get(key);
        }
        System.out.println("首次查询，创建对象：" + key);

        ITicket ticket = new TrainTicket(from,to);
        pool.put(key,ticket);
        return pool.get(key);
    }
}
