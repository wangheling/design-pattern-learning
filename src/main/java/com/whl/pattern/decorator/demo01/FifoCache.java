package com.whl.pattern.decorator.demo01;

import java.util.LinkedList;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/29 10:49
 */
public class FifoCache implements ICache {

    private ICache delegate;

    private LinkedList<String> keyList;

    private int size;

    public FifoCache(ICache iCache) {
        this.delegate = iCache;
        keyList = new LinkedList();
        this.size = 5;
    }

    @Override
    public void put(String key, String value) {
        if (delegate.size() >= size) {
            String removeKey = keyList.removeLast();
            System.out.println("删除key=" + removeKey);
            delegate.del(removeKey);
        }
        keyList.addFirst(key);
        delegate.put(key,value);

    }

    @Override
    public String get(String key) {
        return delegate.get(key);
    }

    @Override
    public void del(String key) {
        delegate.del(key);
        boolean contains = keyList.contains(key);
        if (contains) {
            keyList.remove(key);
        }
    }

    @Override
    public int size() {
        return delegate.size();
    }
}
