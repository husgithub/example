package com.hs.example.base._5varinit.staticinit;

public class InitSeqChild extends InitSeqParent {

    static Dog a = new Dog("E");

    Dog b = new Dog("F");

    static Dog c ;

    static {
        c = new Dog("G");
    }

    Dog d ;

    {
        d = new Dog("H");
    }

    InitSeqChild(){
        System.out.println("InitSeqChild Constructor...");
    }

    public static void main(String[] args) {
        new InitSeqChild();
    }
}
