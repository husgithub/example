package com.hs.example.base._5varinit.staticinit;

public class InitSeqParent {

    static Dog a = new Dog("A");

    Dog b = new Dog("B");

    static Dog c;

    static {
        c = new Dog("C");
    }

    Dog d;

    {
        d = new Dog("D");
    }

    InitSeqParent() {
        System.out.println("InitSeqParent Constructor...");
    }

}
