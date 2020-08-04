package com.designpattern.model;

public class MarioCharacterReceiver {
    private String name;

    public void moveUp(){
        System.out.println(getName() + " moving up!");
    }

    public void moveDown(){
        System.out.println(getName() + " moving down!");
    }

    public void moveLeft(){
        System.out.println(getName() + " moving left!");
    }

    public void moveRight(){
        System.out.println(getName() + " moving right!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
