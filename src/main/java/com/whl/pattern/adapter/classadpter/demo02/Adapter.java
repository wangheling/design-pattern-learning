package com.whl.pattern.adapter.classadpter.demo02;

public class Adapter extends Adaptee implements Target {
    @Override
    public int request() {
        return super.specificRequest() / 10;
    }
}
