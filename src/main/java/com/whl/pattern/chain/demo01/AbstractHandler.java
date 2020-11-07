package com.whl.pattern.chain.demo01;

/**
 * @Author: heling
 * @Date: 2020/11/7 21:24
 * @Description:
 */
public abstract class AbstractHandler<T> {


    public AbstractHandler nextHandler;

    public void setNextHandler(AbstractHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void doHandler(String account, String password);

    //改造
    public static class Builder<T> {

        private AbstractHandler<T> head;

        private AbstractHandler<T> tail;


        public Builder<T> addHandler(AbstractHandler handler) {
            if (this.head == null) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.nextHandler = handler;
            this.tail = handler;
            return this;
        }


        public AbstractHandler<T> build() {

            return this.head;

        }
    }


}
