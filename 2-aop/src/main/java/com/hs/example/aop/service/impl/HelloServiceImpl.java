package com.hs.example.aop.service.impl;


import com.hs.example.aop.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        if(name == null || name.equals("")){
            throw new RuntimeException("name 为空。。");
        }
        System.out.println("hello "+name +" !");
    }
}
