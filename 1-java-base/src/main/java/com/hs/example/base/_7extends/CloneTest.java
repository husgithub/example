package com.hs.example.base._7extends;

public class CloneTest {

    public static void main(String[] args) {
        AnObject a = new AnObject();
        a.setName("abc");
        try {
            AnObject b = (AnObject)a.clone();
            System.out.println(a);
            System.out.println(b);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
