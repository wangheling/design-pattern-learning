package com.whl.pattern.state.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/12 16:12
 */
public class AppContext {

    public static final LoginState UNLOGIN = new UnLoginState();
    public static final LoginState LOGINED = new LoginedState();

    {
        UNLOGIN.setContext(this);
        LOGINED.setContext(this);
    }

    private LoginState currentState = UNLOGIN;

    public void setLoginState(LoginState loginState) {
        this.currentState = loginState;
    }

    public void comment(String title, String content) {
        currentState.comment(title, content);
    }

    public void like(String title) {
        currentState.like(title);
    }

}
