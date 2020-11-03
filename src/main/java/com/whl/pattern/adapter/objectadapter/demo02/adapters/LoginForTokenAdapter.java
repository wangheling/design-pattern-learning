package com.whl.pattern.adapter.objectadapter.demo02.adapters;


import com.whl.pattern.adapter.objectadapter.demo02.ResultMsg;


public class LoginForTokenAdapter extends AbstraceAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
