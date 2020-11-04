package com.whl.pattern.delegate.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: heling
 * @Date: 2020/11/4 21:21
 * @Description:
 */
public class Boss {

    private static Map<String, Emploee> map = new HashMap<>();

    public Boss() {
        map.put("打印资料", new AEmploee());
        map.put("准备会议", new BEmploee());
    }

    public void delegateTask(String task) {
        Emploee emploee = map.get(task);
        emploee.doTask();
    }





}
