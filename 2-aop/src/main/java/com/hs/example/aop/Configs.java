package com.hs.example.aop;

import com.hs.example.aop.service.aspect.MyAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {

    @Bean(name = "myAspect")
    public MyAspect initMyAspect(){
        return new MyAspect();
    }
}
