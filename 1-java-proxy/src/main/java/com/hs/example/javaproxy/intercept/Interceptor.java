package com.hs.example.javaproxy.intercept;

/**
 * 自定义拦截器接口
 */
public interface Interceptor {

    /**
     * 事前方法
     * @return
     */
    public boolean before();

    /**
     *事后方法
     */
    public void after();
}
