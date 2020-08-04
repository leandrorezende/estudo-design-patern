package com.designpattern.model;

import com.designpattern.interfaces.Command;

public class MarioLeftCommand implements Command {

    private MarioCharacterReceiver marioCharacterReceiver;

    public MarioLeftCommand(MarioCharacterReceiver marioCharacterReceiver) {
        this.marioCharacterReceiver = marioCharacterReceiver;
    }

    @Override
    public void execute() {
        marioCharacterReceiver.moveLeft();
    }
}
