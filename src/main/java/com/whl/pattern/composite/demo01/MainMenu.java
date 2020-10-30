package com.whl.pattern.composite.demo01;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/30 13:40
 */
public class MainMenu implements Menu {

    private List<Menu> children = new ArrayList<>();
    private String name;

    public MainMenu(String name) {
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
        System.out.println(name);
    }
}
