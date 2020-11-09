package com.whl.pattern.strategy.demo01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/9 10:29
 */
public class Context {

    private static final Map<Integer, SaleStrategy> strageties = new ConcurrentHashMap<>();

    static {
        strageties.put(1,new Level1VipStragety());
        strageties.put(2,new Level2VipStragety());
        strageties.put(3,new Level3VipStragety());
    }

    public double getPrice(int level, double orginPrice) {

        return strageties.get(level).getPrice(orginPrice);

    }


}
