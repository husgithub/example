package com.hs.example.base._5varinit.staticinit;

public class StaticClassTest {

    public StaticClassTest(){
        System.out.println("StaticClassTest constructor...");
    }
    static int i;
    static{
        i = 9;
        System.out.println("i= "+i);
    }
    static Dog dog = new Dog("黑");

    public static void main(String[] args) {
       // StaticClassTest.dog.print();
        /**
         * 构造器实际上也是静态方法(Thinking in Java 96)，
         */
        new StaticClassTest();
    }
}
