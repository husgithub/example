package com.hs.example.base._5varinit.staticinit;

public class Dog {

    private String name;

    public Dog(String name) {
        System.out.println("Dog Constructor...,dog's name: " + name);
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("dog's name is: " + name);
    }
}
