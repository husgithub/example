package com.hs.example.base._7extends;

/**
 * 必须实现标记接口  Cloneable  否则会抛出CloneNotSupportedException异常
 */
public class AnObject implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnObject{" +
                "name='" + name + '\'' +
                '}';
    }

    public void test() throws CloneNotSupportedException {
        super.clone();
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}
