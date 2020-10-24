package com.whl.pattern.singleton.lazy;

/**
 * @Author: heling
 * @Date: 2020/10/24 17:56
 * @Description: 懒汉式单例：双重检查锁
 */
public class LazyDoubleCheckSingleton {

    // volatile保证可见性
    private static volatile LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton() {

        //防止反射使用构造器破会单例
        if (null != instance) {
            throw new RuntimeException("不允许非法访问");
        }

    }

//    public static synchronized LazySingleton getInstance() {
//        if (null == instance) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    public static LazyDoubleCheckSingleton getInstance() {
        // 双重检查锁
        if (null == instance) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null == instance) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }


    public static void main(String[] args) {
        System.out.println(LazyDoubleCheckSingleton.getInstance());
        System.out.println(LazyDoubleCheckSingleton.getInstance());
//        com.whl.pattern.singleton.lazy.LazySingleton@1540e19d
//        com.whl.pattern.singleton.lazy.LazySingleton@1540e19d
    }


}
