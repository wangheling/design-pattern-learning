package com.whl.principle.lod.demo01;

import javax.sound.midi.Soundbank;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 14:42
 */
public class StarbuckCoffeeMachine implements CoffeeMachine {

    @Override
    public void makeAmecicanCoffee() {
        grindingCoffeeBean();
        extractedCoffeePowder();
        addWater();
        System.out.println("美式制作完成");
    }

    @Override
    public void makeLatte() {
        grindingCoffeeBean();
        extractedCoffeePowder();
        addMilk();
        addSugar();
        System.out.println("拿铁制作完成");
    }


    public void grindingCoffeeBean() {
        System.out.println("磨咖啡豆");
    }

    public void extractedCoffeePowder() {
        System.out.println("萃取咖啡粉");
    }

    public void addWater() {
        System.out.println("加水");
    }
    
    public void addMilk() {
        System.out.println("加牛奶");
    }
    
    public void addSugar() {
        System.out.println("加糖");
    }
}
