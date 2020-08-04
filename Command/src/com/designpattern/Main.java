package com.designpattern;

import com.designpattern.model.*;

public class Main {
    public static void main(String[] args) {
        // Create our receivers
        MarioCharacterReceiver mario = new MarioCharacterReceiver();
        mario.setName("Mario");

        KirbyCharacterReceiver kirby = new KirbyCharacterReceiver();
        kirby.setName("Kirby");

        // Create commands
        MarioUpCommand marioUpCommand = new MarioUpCommand(mario);
        MarioDownCommand marioDownCommand = new MarioDownCommand(mario);
        MarioLeftCommand marioLeftCommand = new MarioLeftCommand(mario);
        MarioRightCommand marioRightCommand = new MarioRightCommand(mario);

        KirbyUpCommand kirbyUpCommand = new KirbyUpCommand(kirby);
        KirbyDownCommand kirbyDownCommand = new KirbyDownCommand(kirby);
        KirbyLeftCommand kirbyLeftCommand = new KirbyLeftCommand(kirby);
        KirbyRightCommand kirbyRightCommand = new KirbyRightCommand(kirby);

        // Invoker
        GameBoy gameBoyWithMarioChar = new GameBoy(marioUpCommand, marioDownCommand, marioLeftCommand, marioRightCommand);
        GameBoy gameBoyWithKirbyChar = new GameBoy(kirbyUpCommand, kirbyDownCommand, kirbyLeftCommand, kirbyRightCommand);

        System.out.println("Mario actions");
        gameBoyWithMarioChar.arrowDown();
        gameBoyWithMarioChar.arrowLeft();
        gameBoyWithMarioChar.arrowRight();
        gameBoyWithMarioChar.arrowUp();

        System.out.println("\nKirby actions");
        gameBoyWithKirbyChar.arrowDown();
        gameBoyWithKirbyChar.arrowLeft();
        gameBoyWithKirbyChar.arrowRight();
        gameBoyWithKirbyChar.arrowUp();
    }
}
