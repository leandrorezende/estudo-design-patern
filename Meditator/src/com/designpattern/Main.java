package com.designpattern;

public class Main {
    public static void main(String[] args) {
        ATCMediator atcMediator = new ATCMediatorImpl();

        AirCraft aC1 = new AirCraftImpl(atcMediator, "aC1");
        AirCraft aC2 = new AirCraftImpl(atcMediator, "aC2");
        AirCraft aC3 = new AirCraftImpl(atcMediator, "aC3");

        atcMediator.addAirCraft(aC1);
        atcMediator.addAirCraft(aC2);
        atcMediator.addAirCraft(aC3);

        aC1.send("teste");
    }
}
