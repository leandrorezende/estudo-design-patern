package com.designpattern.models;

import com.designpattern.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class GeekyStoreIterator implements Iterator {
    private ArrayList<Product> catalog;
    private int position = 0;

    public GeekyStoreIterator(ArrayList<Product> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        return (position >= catalog.size() || catalog.get(position) == null) ? false : true;
    }

    @Override
    public Object next() {
        Product product = catalog.get(position);
        position++;
        return product;
    }
}
