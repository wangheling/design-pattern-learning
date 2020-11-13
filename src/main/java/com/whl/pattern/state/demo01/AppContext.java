package com.whl.pattern.state.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/11/12 16:12
 */
public class AppContext {

    public static final UserState UNLOGIN = new UnLoginState();
    public static final UserState LOGINED = new LoginState();

    {
        UNLOGIN.setContext(this);
        LOGINED.setContext(this);
    }

    private UserState currentState = UNLOGIN;

    public void setLoginState(UserState userState) {
        this.currentState = userState;
    }

    public void comment(String title, String content) {
        currentState.comment(title, content);
    }

    public void like(String title) {
        currentState.like(title);
    }

}
