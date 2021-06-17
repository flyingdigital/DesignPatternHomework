package com.flyingdigital.ConcreteFactory;

import com.flyingdigital.AbstractFactory.Factory;
import com.flyingdigital.ConcreteConditioner.TCLConditioner;
import com.flyingdigital.ConcreteTV.TCLTV;
import com.flyingdigital.Conditioner.Conditioner;
import com.flyingdigital.TV.TV;

public class TCL extends Factory {
    @Override
    public TV createTV() {
        return new TCLTV();
    }

    @Override
    public Conditioner createConditioner() {
        return new TCLConditioner();
    }
}
