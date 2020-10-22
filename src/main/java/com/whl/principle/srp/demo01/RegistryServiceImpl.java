package com.whl.principle.srp.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/22 13:19
 */
public class RegistryServiceImpl implements RegistryService {
    @Override
    public void registryUser(String userName, String password) {
        System.out.println("校验用户名：" + userName);
        System.out.println("校验密码：" + password);
        System.out.println("保存到数据库，注册成功");
        //注册服务只负责注册，发送短信，下方优惠券等操作不应该放到注册接口里
        System.out.println("发布注册消息");
        SubscribeSystem.publish(userName);
    }
}
