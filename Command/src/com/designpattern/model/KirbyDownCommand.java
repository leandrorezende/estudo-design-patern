package com.designpattern.model;

import com.designpattern.interfaces.Command;

public class KirbyDownCommand implements Command {

    private KirbyCharacterReceiver kirbCharacter;

    public KirbyDownCommand(KirbyCharacterReceiver kirbCharacter) {
        this.kirbCharacter = kirbCharacter;
    }

    @Override
    public void execute() {
        kirbCharacter.moveDown();
    }
}
