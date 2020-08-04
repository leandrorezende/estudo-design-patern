package com.designpattern.model;

import com.designpattern.SodaMachine;

public class SoldState implements State {

    private SodaVendingMachine sodaVendingMachine;

    public SoldState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("Give a second... soda coming right up");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Sorry... soda is coming...");
    }

    @Override
    public void select() {
        System.out.println("Nope... you already choose your soda");
    }

    @Override
    public void dispense() {
        System.out.println("Your soda is ready");
        if (sodaVendingMachine.getCount() > 0) {
            sodaVendingMachine.setCount(sodaVendingMachine.getCount() - 1);
            sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
        }
        else{
            System.out.println("Sorry out of sodas");
            sodaVendingMachine.setState(sodaVendingMachine.getSoldState());
        }
    }

    @Override
    public String toString() {
        return "Dispensing soda...";
    }
}
