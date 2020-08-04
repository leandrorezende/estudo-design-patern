package com.designpattern.model;

import com.designpattern.interfaces.Command;

public class KirbyLeftCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacter = new KirbyCharacterReceiver();

    public KirbyLeftCommand(KirbyCharacterReceiver kirbyCharacter) {
        this.kirbyCharacter = kirbyCharacter;
    }

    @Override
    public void execute() {
        kirbyCharacter.moveLeft();
    }
}
