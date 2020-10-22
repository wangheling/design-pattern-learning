package com.whl.principle.srp.demo01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 13:20
 */
public class SubscribeSystem {

    private static final Set<Subsriber> subsribers = new HashSet<>();

    public static void publish(String userName) {
        for (Subsriber subsriber : subsribers) {
            subsriber.consume(userName);
        }
    }

    public static void subsribe(Subsriber subsriber) {
        subsribers.add(subsriber);
    }




}
