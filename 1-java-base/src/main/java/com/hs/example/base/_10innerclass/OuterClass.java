package com.hs.example.base._10innerclass;

public class OuterClass {

    private int i = 1;

    class InnerClass{

        private int j = 2;

        public void print(){
            System.out.println("i = "+i);
        }
    }

    InnerClass inner(){
        return new InnerClass();
    }

    public static void main(String[] args) {
        //OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        OuterClass.InnerClass innerClass = new OuterClass().inner();
        innerClass.print();
    }
}
