package com.designpattern;

import com.designpattern.Game;

public class EndlessRunnerGame extends Game {

    @Override
    void initialize() {
        System.out.println("Endless Runner initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Endless Runner starting...");
    }

    @Override
    void endPlay() {
        System.out.println("Endless Runner ending...");
    }

    @Override
    protected void addNewCharacterToTheGame() {

    }

}
