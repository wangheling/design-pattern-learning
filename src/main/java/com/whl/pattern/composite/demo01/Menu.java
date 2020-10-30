package com.whl.pattern.composite.demo01;

import java.util.List;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/30 13:35
 */
public interface Menu {

    void add(Menu menu);

    void delete(Menu menu);

    List<Menu> getChildMenu();

    void show();

}
