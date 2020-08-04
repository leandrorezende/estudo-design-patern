package com.designpattern.model;

import com.designpattern.interfaces.Command;

public class KirbyUpCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacter;

    public KirbyUpCommand(KirbyCharacterReceiver kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveUp();
    }
}
