package com.designpattern;

public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // template method
    public final void play(){
        loadAssets();
        initialize();
        startPlay();
        if(addNewGameCharacter()){
            addNewCharacterToTheGame();
        }
        endPlay();
    }

    // Hooked on Template Method
    protected abstract void addNewCharacterToTheGame();

    public void loadAssets(){
        System.out.println("Loading Game Assets");
    }

    boolean addNewGameCharacter(){
        return true;
    }
}
