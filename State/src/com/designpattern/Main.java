package com.designpattern;

import com.designpattern.model.SodaVendingMachine;

public class Main {
    public static void main(String[] args) {
        SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
        System.out.println(sodaVendingMachine);

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.dispense();

        System.out.println(sodaVendingMachine);

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.dispense();

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.dispense();

        System.out.println(sodaVendingMachine);
/*
        SodaMachine sodaMachine = new SodaMachine(10);
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        System.out.println("Inventory: " + sodaMachine.getCount());

        System.out.println("----------");
        sodaMachine.insertMoney();
        sodaMachine.ejectMoney();
        sodaMachine.selectSoda();
        System.out.println("Inventory: " + sodaMachine.getCount());

        System.out.println("----------");
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();
        sodaMachine.ejectMoney();
        System.out.println("Inventory: " + sodaMachine.getCount());
        */
    }
}
