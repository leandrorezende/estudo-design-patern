package com.designpattern.models;

import com.designpattern.Product;

import java.util.Iterator;

public class DevStoreIterator implements Iterator {
    private Product[] catalog;
    private int position = 0;

    public DevStoreIterator(Product[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        return (position >= catalog.length || catalog[position] == null) ? false : true;
    }

    @Override
    public Object next() {
        Product product = catalog[position];
        position++;
        return product;
    }

    @Override
    public void remove() {
        if(position <= 0)
            throw new IllegalStateException("Can't remove item until you've done at leat one next()");
        if(catalog[position - 1] == null){
            for(int i = position-1; i<(catalog.length -1); i++){
                catalog[i] = catalog[i+1];
            }
            catalog[catalog.length-1] = null;
        }
    }
}
