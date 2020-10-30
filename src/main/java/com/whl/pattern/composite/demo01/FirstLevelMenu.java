package com.whl.pattern.composite.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/30 13:39
 */
public class FirstLevelMenu implements Menu {

    private List<Menu> children = new ArrayList<>();

    private String name;

    public FirstLevelMenu(String name) {
        this.name = name;
    }


    @Override
    public void add(Menu menu) {
        children.add(menu);
    }

    @Override
    public void delete(Menu menu) {
        children.remove(menu);
    }

    @Override
    public List<Menu> getChildMenu() {
        return children;
    }

    @Override
    public void show() {
        System.out.println("++" + name);
    }
}
