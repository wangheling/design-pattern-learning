package com.whl.pattern.singleton.lazy;

/**
 * @Author: heling
 * @Date: 2020/10/24 17:56
 * @Description: 懒汉式单例
 */
public class LazySingleton {

    // volatile保证可见性
    private static volatile LazySingleton instance;

    private LazySingleton() {

    }

//    public static synchronized LazySingleton getInstance() {
//        if (null == instance) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    public static LazySingleton getInstance() {
        // 双重检查锁
        if (null == instance) {
            synchronized (LazySingleton.class) {
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
//        com.whl.pattern.singleton.lazy.LazySingleton@1540e19d
//        com.whl.pattern.singleton.lazy.LazySingleton@1540e19d
    }


}
