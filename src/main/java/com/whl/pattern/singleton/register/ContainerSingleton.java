package com.whl.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: heling
 * @Date: 2020/10/24 21:30
 * @Description: 容器式单例
 */
public class ContainerSingleton {

    private ContainerSingleton() {

    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        if (!ioc.containsKey(className)) {
            Object instance = null;
            try {
                instance = Class.forName(className).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ioc.put(className, instance);
        }
        return ioc.get(className);
    }


    public static void main(String[] args) {
        Object instance = ContainerSingleton.getInstance("com.whl.pattern.singleton.register.TestClass");
        Object instance2 = ContainerSingleton.getInstance("com.whl.pattern.singleton.register.TestClass");
        System.out.println(instance.equals(instance2));
    }
}
