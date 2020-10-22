package com.whl.principle.ocp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 10:05
 */
public class Apple implements IFruit {

    private String name;

    private Double price;

    public Apple(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
