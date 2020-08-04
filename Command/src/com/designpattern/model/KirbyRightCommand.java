package com.designpattern.model;

import com.designpattern.interfaces.Command;

public class KirbyRightCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacter = new KirbyCharacterReceiver();

    public KirbyRightCommand(KirbyCharacterReceiver kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveRight();
    }
}
