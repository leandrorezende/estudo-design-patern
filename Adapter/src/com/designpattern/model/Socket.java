package com.designpattern.model;

import com.designpattern.interfaces.Volt;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
