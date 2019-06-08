package com.hs.example.javaproxy.service.impl;

import com.hs.example.javaproxy.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        System.out.println("hello "+name +" !");
    }
}
