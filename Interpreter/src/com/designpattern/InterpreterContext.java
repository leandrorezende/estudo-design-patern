package com.designpattern;

public class InterpreterContext {
    public String getBinaryFormart(int i){
        return Integer.toBinaryString(i);
    }

    public String getHexFormat(int i){
        return Integer.toHexString(i);
    }
}
