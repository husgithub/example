package com.hs.example.base._7extends;

public class B extends A{

    public B(int i){
        super(++i);
        System.out.println("B:"+i);
    }

    public static void main(String[] args) {
        new B(1);
    }
}
