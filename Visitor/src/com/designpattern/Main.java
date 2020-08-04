package com.designpattern;

public class Main {
    public static void main(String[] args) {
        TaxVisitor taxVisitor = new TaxVisitor();

        Jacket jacket = new Jacket(50.00);
        TShirt tShirt = new TShirt(24.99);
        Shirt shirt = new Shirt(22.89);

        System.out.println(jacket.accept(taxVisitor));
        System.out.println(tShirt.accept(taxVisitor));
        System.out.println(shirt.accept(taxVisitor));

    }
}
