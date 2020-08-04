package com.designpattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy");
        Bank bank = new ProxyBank();
        try {
            bank.withdraw("me@");
            bank.withdraw("me@me");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
