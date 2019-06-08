package com.hs.example.javaproxy.intercept;

public class MyInterceptor implements Interceptor{
    @Override
    public boolean before() {
        System.out.println("before sayHello......");
        return false;
    }

    @Override
    public void after() {
        System.out.println("after sayHello......");
    }
}
