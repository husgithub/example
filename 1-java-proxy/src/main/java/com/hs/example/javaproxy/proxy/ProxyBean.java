package com.hs.example.javaproxy.proxy;

import com.hs.example.javaproxy.intercept.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBean implements InvocationHandler{

    /**
     * 被代理的对象
     */
    private Object target;

    /**
     * 拦截器
     */
    private Interceptor interceptor;

    public static Object getProxyBean(Object target, Interceptor interceptor){
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = target;
        proxyBean.interceptor = interceptor;
        //生成代理对象
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),proxyBean);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        this.interceptor.before();
        result = method.invoke(target,args);
        this.interceptor.after();
        return result;
    }
}
