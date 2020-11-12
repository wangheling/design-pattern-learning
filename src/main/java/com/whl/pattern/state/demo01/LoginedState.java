package com.whl.pattern.state.demo01;

/**
 * @Desc：登录状态
 * @Author: heling
 * @Date: 2020/11/12 16:09
 */
public class LoginedState extends LoginState {
    @Override
    public void comment(String title, String content) {
        System.out.println("评论文章" + title + "内容为：" + content);
    }

    @Override
    public void like(String title) {
        System.out.println("点赞文章" + title);
    }
}
