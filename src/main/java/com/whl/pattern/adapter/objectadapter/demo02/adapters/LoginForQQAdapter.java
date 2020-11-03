package com.whl.pattern.adapter.objectadapter.demo02.adapters;


import com.whl.pattern.adapter.objectadapter.demo02.ResultMsg;


public class LoginForQQAdapter extends AbstraceAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        if(!support(adapter)){return null;}
        return super.loginForRegist(id,null);

    }

}
