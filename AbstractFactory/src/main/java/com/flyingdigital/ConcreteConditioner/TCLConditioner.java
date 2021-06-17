package com.flyingdigital.ConcreteConditioner;

import com.flyingdigital.Conditioner.Conditioner;

public class TCLConditioner extends Conditioner {
    @Override
    public void play() {
        System.out.println("TCL空调正在工作");
    }
}
