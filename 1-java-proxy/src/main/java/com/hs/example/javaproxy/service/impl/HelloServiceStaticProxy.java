package com.hs.example.javaproxy.service.impl;

import com.hs.example.javaproxy.service.HelloService;

/**
 * 静态代理类
 */
public class HelloServiceStaticProxy implements HelloService{

    private HelloService helloService;

    public HelloServiceStaticProxy(HelloService helloService){
        this.helloService = helloService;
    }

    @Override
    public void sayHello(String name) {
        System.out.println("before sayHello......");
        helloService.sayHello(name);
        System.out.println("after sayHello......");
    }

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceStaticProxy(new HelloServiceImpl());
        helloService.sayHello("zs");
    }
}
