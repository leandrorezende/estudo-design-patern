package com.designpattern;

public class RealBank implements Bank{
    @Override
    public void withdraw(String clientName) throws Exception {
        System.out.println(clientName + " witdrawing from the ATM...");
    }
}
