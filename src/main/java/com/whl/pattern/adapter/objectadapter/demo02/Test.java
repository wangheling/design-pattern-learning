package com.whl.pattern.adapter.objectadapter.demo02;

public class Test {

    public static void main(String[] args) {

        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");
    }
}
