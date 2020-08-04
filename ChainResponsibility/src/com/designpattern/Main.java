package com.designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        CEOPurchasePower ceoPurchasePower = new CEOPurchasePower();
        DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
        ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();

        ceoPurchasePower.setSucessor(null);
        directorPurchasePower.setSucessor(ceoPurchasePower);
        managerPurchasePower.setSucessor(directorPurchasePower);

        while (true) {
            System.out.println("Enter the amount to check who should aprove your budget:");
            System.out.print(">>");
            try {
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                managerPurchasePower.processRequest(new PurchaseRequest(d, "By Stuff"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
