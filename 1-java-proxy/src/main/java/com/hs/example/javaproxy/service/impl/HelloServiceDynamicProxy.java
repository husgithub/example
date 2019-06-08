package com.hs.example.javaproxy.service.impl;

import com.hs.example.javaproxy.service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class HelloServiceDynamicProxy implements InvocationHandler{

    private HelloService helloService;

    public HelloServiceDynamicProxy(HelloService helloService){
        this.helloService = helloService;
    }

    public  HelloService getProxyBean (){
        return (HelloService) Proxy.newProxyInstance(HelloService.class.getClassLoader(), new Class[] { HelloService.class },this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("before sayHello......");
        result = method.invoke(helloService,args);
        System.out.println("after sayHello......");
        return result;
    }

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceDynamicProxy(new HelloServiceImpl()).getProxyBean();
        helloService.sayHello("zs");
    }
}
