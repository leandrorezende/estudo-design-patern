package com.designpattern;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator{

    private List<AirCraft> airCraftsList;

    public ATCMediatorImpl() {
        this.airCraftsList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, AirCraft airCraft) {
        this.airCraftsList.stream().filter(aC -> aC != airCraft ).forEach(aC -> aC.receive(msg));
    }

    @Override
    public void addAirCraft(AirCraft airCraft) {
        airCraftsList.add(airCraft);
    }
}
