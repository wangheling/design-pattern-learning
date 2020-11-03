package com.whl.pattern.adapter.objectadapter.demo01;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * @Desc：对象适配器
 * @Author: heling
 * @Date: 2020/11/3 10:19
 */
public class HashMapObserverAdapter implements Observer {
    private HashMap hashMap;

    public HashMapObserverAdapter(HashMap hashMap) {

        this.hashMap = hashMap;

    }

    @Override
    public void update(Observable o, Object arg) {
        hashMap.clear();
    }

    public static void main(String[] args) {
        HashMapObserverAdapter adapter = new HashMapObserverAdapter(new HashMap());
        adapter.hashMap.put("name","heling");
        Object name = adapter.hashMap.get("name");
        System.out.println(name.toString());
    }
}
