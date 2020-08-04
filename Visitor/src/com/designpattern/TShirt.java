package com.designpattern;

public class TShirt implements Visitable{

    private double price;

    public TShirt(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visitor(this);
    }
}
