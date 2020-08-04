package com.designpattern;

public class Main {

    public static void main(String[] args) {
        User James = new User.UserBuilder("Jame", "Bond")
                .address("123, London")
                .age(44)
                .phoneNumber("007")
                .build();
        System.out.println(James);

        Person oldPerson = new Person.Builder("James", "Bond")
                .phoneNumber("52")
                .address("Lodon")
                .age(44)
                .build();
        System.out.println(oldPerson);
    }

}
