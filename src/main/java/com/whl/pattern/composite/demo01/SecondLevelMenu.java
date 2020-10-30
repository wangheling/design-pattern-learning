package com.whl.pattern.composite.demo01;

import java.util.List;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/30 13:39
 */
public class SecondLevelMenu implements Menu {

    private String name;

    public SecondLevelMenu(String name) {
        this.name = name;
    }


    @Override
    public void add(Menu menu) {

    }

    @Override
    public void delete(Menu menu) {

    }

    @Override
    public List<Menu> getChildMenu() {
        return null;
    }

    @Override
    public void show() {
        System.out.println("++++" + name);
    }
}
