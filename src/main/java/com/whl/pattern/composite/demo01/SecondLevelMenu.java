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
        throw new UnsupportedOperationException("二级菜单不支持添加子菜单");
    }

    @Override
    public void delete(Menu menu) {
        throw new UnsupportedOperationException("二级菜单不支持自删，请从一级菜单处删除");
    }

    @Override
    public List<Menu> getChildMenu() {
        throw new UnsupportedOperationException("二级菜单不支持获取子菜单");
    }

    @Override
    public void show() {
        System.out.println("++++" + name);
    }
}
