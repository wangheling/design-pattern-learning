package com.whl.pattern.builder.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/28 9:54
 */
public class PhoneBuilder {
    private Phone phone = new Phone();

    public Phone build() {
        return phone;
    }


    public PhoneBuilder buildBrand(String brand) {
        phone.setBrand(brand);
        return this;
    }

    public PhoneBuilder buildWeight(String weight) {
        phone.setWeight(weight);
        return this;
    }

    public PhoneBuilder buildColor(String color) {
        phone.setColor(color);
        return this;
    }

    public PhoneBuilder buildMemory(String memory) {
        phone.setMemory(memory);
        return this;
    }

}
