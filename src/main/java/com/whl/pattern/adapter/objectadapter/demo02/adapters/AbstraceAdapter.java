package com.whl.pattern.adapter.objectadapter.demo02.adapters;


import com.whl.pattern.adapter.objectadapter.demo02.PassportService;
import com.whl.pattern.adapter.objectadapter.demo02.ResultMsg;

public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {

    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
