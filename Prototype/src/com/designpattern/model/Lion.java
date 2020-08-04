package com.designpattern.model;

public class Lion implements Animal{
    private String name;
    private int age;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person is created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Animal clone() {
        System.out.println("Creating Person...");
        Lion lion = null;
        try {
            lion = (Lion)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return lion;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
