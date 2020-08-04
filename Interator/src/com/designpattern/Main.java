package com.designpattern;

import com.designpattern.models.Catalog;
import com.designpattern.models.Seller;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Catalog devStoreCatalog = new DevStoreCatalog();
        Catalog geekyStoreCatalog = new GeekyStoreCatalog();

        Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
        seller.printCatalog();
    }
}
