package com.whl.pattern.composite.demo01;

import java.util.List;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/30 13:47
 */
public class Test {

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu("主菜单");

        FirstLevelMenu firstLevelMenu01 = new FirstLevelMenu("任务管理");
        SecondLevelMenu secondLevelMenu01 = new SecondLevelMenu("任务列表");
        SecondLevelMenu secondLevelMenu02 = new SecondLevelMenu("任务分析");
        mainMenu.add(firstLevelMenu01);
        firstLevelMenu01.add(secondLevelMenu01);
        firstLevelMenu01.add(secondLevelMenu02);

        FirstLevelMenu firstLevelMenu02 = new FirstLevelMenu("租户管理");
        SecondLevelMenu secondLevelMenu03 = new SecondLevelMenu("租户列表");
        SecondLevelMenu secondLevelMenu04 = new SecondLevelMenu("租户配置");
        mainMenu.add(firstLevelMenu02);
        firstLevelMenu02.add(secondLevelMenu03);
        firstLevelMenu02.add(secondLevelMenu04);


        mainMenu.show();
        List<Menu> childMenu = mainMenu.getChildMenu();
        for (Menu menu : childMenu) {
            menu.show();
            List<Menu> childMenu1 = menu.getChildMenu();
            for (Menu menu1 : childMenu1) {
                menu1.show();
            }
        }


    }
}
