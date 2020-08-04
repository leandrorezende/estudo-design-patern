package com.designpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootballGame extends Game {

    @Override
    void initialize() {
        System.out.println("Football initializing...");
    }

    @Override
    void startPlay() {
        System.out.println("Football starting...");
    }

    @Override
    void endPlay() {
        System.out.println("Football ending...");
    }

    @Override
    public boolean addNewGameCharacter(){
        return playerWantsNewCharacter();
    }

    @Override
    protected void addNewCharacterToTheGame() {
        System.out.println("Adding new Character to the FootBallGame");
    }

    public boolean playerWantsNewCharacter(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like to add new character to the game?(y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException ioe){
            System.out.println("IO Error");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }

}

