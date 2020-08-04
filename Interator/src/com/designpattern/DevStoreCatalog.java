package com.designpattern;

import com.designpattern.models.Catalog;
import com.designpattern.models.DevStoreIterator;

import java.util.Iterator;

public class DevStoreCatalog implements Catalog {
    private static final int MAX_ITENS = 3;
    private int numberOfProducts = 0;
    private Product[] catalog;

    public DevStoreCatalog() {
        catalog = new Product[MAX_ITENS];
        addItem("C++ is not dead. Yet!", "T-shirt", 30.11);
        addItem("Java Rocks", "Silky mouse-pad", 13.33);
        addItem("Web Developement cookbook", "The bes web deve", 12.33);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);

        if(numberOfProducts >= MAX_ITENS)
            System.out.println("Catalog is full - can't add products.");
        else {
            catalog[numberOfProducts] = product;
            numberOfProducts++;
        }
    }

    public Iterator createIterator(){
        return new DevStoreIterator(catalog);
    }

}
