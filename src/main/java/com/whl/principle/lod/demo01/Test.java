package com.whl.principle.lod.demo01;

import javax.sound.midi.Soundbank;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 14:49
 */
public class Test {

    //违背迪米特法则
//    public static void main(String[] args) {
//        StarbuckCoffeeMachine coffeeMachine = new StarbuckCoffeeMachine();
//        coffeeMachine.grindingCoffeeBean();
//        coffeeMachine.extractedCoffeePowder();
//        coffeeMachine.addMilk();
//        coffeeMachine.addSugar();
//        System.out.println("拿铁制作完成");
//    }

    public static void main(String[] args) {
        StarbuckCoffeeMachine coffeeMachine = new StarbuckCoffeeMachine();
        coffeeMachine.makeLatte();
        System.out.println("==============");
        coffeeMachine.makeAmecicanCoffee();
    }


}
