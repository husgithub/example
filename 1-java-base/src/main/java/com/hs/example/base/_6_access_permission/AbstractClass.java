package com.hs.example.base._6_access_permission;

public abstract class AbstractClass {

    /**
     * 不合法的代码，子类无法继承
     */
    //private abstract void print();

    /**
     * 不建议的代码 这样虽然同一个包下的子类可以继承实现该方法，但是不同包下子类却无法继承
     */
    //abstract void print2();

    protected abstract  void print3();

    public abstract  void print4();
}
