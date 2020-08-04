package com.designpattern;

public class SodaMachine {
    // States
    private final static int SOLD_OUT = 0;
    private final static int NO_MONEY = 1;
    private final static int HAS_MONEY = 2;
    private final static int SOLD = 3;
    private int state = SOLD_OUT;
    private int count = 0;

    public SodaMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_MONEY;
            System.out.println("Welcome to our Soda Vending Machine");
            System.out.println("Inventory is  " + count + " sodas");
            System.out.println("Insert a dollar bill to get started...");
        }
    }

    // Actions
    public void insertMoney() {
        if (state == HAS_MONEY)
            System.out.println("You can't insert another dollar bill");
        else if (state == NO_MONEY) {
            state = HAS_MONEY;
            System.out.println("You inserted a dollar");
        } else if (state == SOLD_OUT)
            System.out.println("The machine is sold out");
        else if (state == SOLD)
            System.out.println("Pleas wait! We are already giving you a soda!");
    }

    public void ejectMoney() {
        if (state == HAS_MONEY) {
            System.out.println("Returning dollar bill");
            state = NO_MONEY;
        } else if (state == NO_MONEY)
            System.out.println("You haven't inserted a dollar bill");
        else if (state == SOLD_OUT)
            System.out.println("The machine is sold out");
        else if (state == SOLD)
            System.out.println("Already selected soda");
    }

    public void selectSoda() {
        if (state == SOLD)
            System.out.println("Dispensing your Soda as we speak...Enjoy");
        else if (state == NO_MONEY)
            System.out.println("You select soda, but money firt, buddy");
        else if (state == SOLD_OUT)
            System.out.println("You're outta luck - No sodas left");
        else if (state == HAS_MONEY) {
            System.out.println("You selected a soda");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD) {
            System.out.println("Dispensing your Soda as we speak Enjoy");
            count--;
            if (count == 0) {
                System.out.println("Sorry, out of sodas");
                state = SOLD_OUT;
            } else
                state = NO_MONEY;
        } else if (state == NO_MONEY)
            System.out.println("Please insert a dollar bill first");
        else if (state == SOLD_OUT)
            System.out.println("Machine sold out");
        else if (state == HAS_MONEY)
            System.out.println("No soda dispensed");
    }

    public int getCount() {
        return count;
    }
}
