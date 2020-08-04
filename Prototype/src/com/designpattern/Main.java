package com.designpattern;

import com.designpattern.model.Lion;

public class Main {

    public static void main(String[] args) {
        Person bonni = new Person("Bonni", 21);
        System.out.println("Person 1: " + bonni);

        Person nina = (Person) bonni.clone();
        System.out.println("Person 2: " + nina);

        Dolphin jerry = new Dolphin("Jerry", 78);
        System.out.println("Dolphin 1: " + jerry);

        Dolphin sam = (Dolphin) jerry.clone();
        System.out.println("Dolphin 2: " + sam);

        Lion lion = new Lion("Mufasa", 14);
        System.out.println(System.identityHashCode(lion) + " - " + lion);

        Lion son = (Lion) lion.clone();
        System.out.println(System.identityHashCode(son) + " - " + son);

    }

}
