package com.whl.pattern.state.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/12 16:08
 */
public abstract class LoginState {

    protected AppContext appContext;

    public void setContext(AppContext appContext) {
        this.appContext = appContext;
    }

    public abstract void comment(String title, String content);

    public abstract void like(String title);
}
