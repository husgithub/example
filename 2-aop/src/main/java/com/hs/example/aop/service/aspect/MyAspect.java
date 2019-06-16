package com.hs.example.aop.service.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {

    /**
     * 定义切点
     * execution 表示拦截定义的正则方法
     * * 表示任何返回类型
     * (..) 表示匹配任何参数方法
     */
    @Pointcut("execution(* com.hs.example.aop.service.impl.HelloServiceImpl.sayHello(..))")
    public void mypointCut(){}

    @Before("mypointCut()")
    public void before(){
        System.out.println("before......");
    }

    @After("mypointCut()")
    public void after(){
        System.out.println("after......");
    }

    @AfterReturning("mypointCut()")
    public void afterReturning(){
        System.out.println("afterReturning......");
    }

    @AfterThrowing("mypointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing......");
    }
}
