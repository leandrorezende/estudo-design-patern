package com.designpattern.models;

import com.designpattern.DevStoreCatalog;
import com.designpattern.GeekyStoreCatalog;
import com.designpattern.Product;

import java.util.Iterator;

public class Seller {
    private Catalog geekyStoreCatalog;
    private Catalog devStoreCatalog;

    public Seller(Catalog geekyStoreCatalog, Catalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }

    public void printCatalog() {
        Iterator geekyIterator = geekyStoreCatalog.createIterator();
        System.out.println("Printing Geeky Catalog:");
        printCatalog(geekyIterator);

        Iterator devIterator = devStoreCatalog.createIterator();
        System.out.println("Printing Catalog:");
        printCatalog(devIterator);
    }

    private void printCatalog(Iterator iterator){
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println(product);
        }
    }
}
