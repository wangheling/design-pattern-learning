package com.whl.principle.lsp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 16:44
 */
public class Test {

    public static void main(String[] args) {
        print(new Parent());
        //子类重写父类的的方法，替换为子类后执行结果不同，违背了里式替换原则
        print(new Child());
    }

    public static void print(Parent parent) {
        int result = parent.method(2, 2);
        System.out.println(result);
    }

}
