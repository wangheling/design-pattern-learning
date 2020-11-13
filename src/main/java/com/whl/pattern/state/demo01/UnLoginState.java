package com.whl.pattern.state.demo01;

/**
 * @Desc：未登录状态
 * @Author: heling
 * @Date: 2020/11/12 16:09
 */
public class UnLoginState extends UserState {
    @Override
    public void comment(String title, String content) {
        switchToLogin();
        System.out.println("评论文章" + title + "内容为：" + content);
    }

    @Override
    public void like(String title) {

        switchToLogin();
        System.out.println("点赞文章" + title);

    }


    private void switchToLogin() {
        System.out.println("未登录，跳转登录");
        this.appContext.setLoginState(AppContext.LOGINED);
        System.out.println("登录成功");
    }
}
