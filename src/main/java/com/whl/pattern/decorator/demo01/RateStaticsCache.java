package com.whl.pattern.decorator.demo01;

/**
 * @Desc：
 * @Author: heling
 * @Date: 2020/10/29 11:03
 */
public class RateStaticsCache implements ICache {

    private ICache delegate;

    private int getRequests;

    private int hits;

    public RateStaticsCache(ICache iCache) {
        delegate = iCache;
        getRequests = 0;
        hits = 0;
    }

    @Override
    public void put(String key, String value) {
        delegate.put(key, value);
    }

    @Override
    public String get(String key) {
        ++getRequests;
        if (null != delegate.get(key)) {
            ++hits;
        }
        System.out.println("命中率：" + ((double) hits / (double) getRequests));
        return delegate.get(key);
    }

    @Override
    public void del(String key) {
        delegate.del(key);
    }

    @Override
    public int size() {
        return delegate.size();
    }
}
