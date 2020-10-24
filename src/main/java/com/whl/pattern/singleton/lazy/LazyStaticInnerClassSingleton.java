package com.whl.pattern.singleton.lazy;

/**
 * @Author: heling
 * @Date: 2020/10/24 18:33
 * @Description: 懒汉式单例：静态内部类
 * <p>
 * 优点：利用java本身语法特点，性能高，避免内存浪费
 * 缺点：能够反射破坏（反射拿到构造器）
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
//防止反射使用构造器破会单例
        if (null != LazyHolder.INSTANCE) {
            throw new RuntimeException("不允许非法访问");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    /**
     * 内部类
     */
    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }


    public static void main(String[] args) {
        System.out.println(LazyStaticInnerClassSingleton.getInstance());
        System.out.println(LazyStaticInnerClassSingleton.getInstance());
    }

}
