package com.designpattern.model;

public class SodaVendingMachine {
    private State soldOutState;
    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;
    private State state = soldOutState;
    private int count = 0;

    public SodaVendingMachine(int numberOfSodas) {
        soldOutState = new SoldOutState(this);
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        this.count = numberOfSodas;

        if(numberOfSodas > 0)
            state = noMoneyState;
    }

    // Actions
    public void insertMoney() {
        state.insertMoney();
    }

    public void ejectMoney() {
        state.ejectMoney();
    }

    public void selectSoda() {
        state.select();
    }

    public void dispense() {
        state.dispense();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nThe SodaMachine, Co");
        result.append("\nInventory: " + getCount() + " soda");
        result.append("\n");
        result.append("\nSoda Vending Machine is " + getState());
        return result.toString();
    }
}
