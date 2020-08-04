package com.designpattern;

import com.designpattern.models.Catalog;
import com.designpattern.models.GeekyStoreIterator;

import java.util.ArrayList;

public class GeekyStoreCatalog implements Catalog {
    private ArrayList<Product> catalog;

    public GeekyStoreCatalog() {
        catalog = new ArrayList<>();
        addItem("Superman Comic", "The best in town", 12.99);
        addItem("Batman Comic", "Okay, but still good", 11.99);
        addItem("Star Wars", "Gotta have it", 29.99);
    }

    private void addItem(String name, String description, double price){
        Product product = new Product(name, description, price);
        catalog.add(product);
    }

    public GeekyStoreIterator createIterator(){
        return new GeekyStoreIterator(catalog);
    }

}
