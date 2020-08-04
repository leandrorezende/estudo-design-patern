package com.designpattern;

public class Assemble implements WorkShop{
    @Override
    public void make() {
        System.out.println("...also");
        System.out.println("Assembled");
    }
}
