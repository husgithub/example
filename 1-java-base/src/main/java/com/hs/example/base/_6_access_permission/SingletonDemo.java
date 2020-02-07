package com.hs.example.base._6_access_permission;

/**
 * 以下为单列模式实现方式
 */
public class SingletonDemo {

    private static SingletonDemo singletonDemo = new SingletonDemo();

    private SingletonDemo() {};

    public static SingletonDemo getSingleton() {
        return singletonDemo;
    }
}
