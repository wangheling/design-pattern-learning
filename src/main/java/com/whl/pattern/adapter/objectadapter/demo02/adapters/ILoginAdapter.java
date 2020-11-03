package com.whl.pattern.adapter.objectadapter.demo02.adapters;


import com.whl.pattern.adapter.objectadapter.demo02.ResultMsg;

public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
