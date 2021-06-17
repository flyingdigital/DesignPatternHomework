package com.flyingdigital;

import com.flyingdigital.AbstractFactory.Factory;
import com.flyingdigital.ConcreteFactory.Haier;
import com.flyingdigital.Conditioner.Conditioner;
import com.flyingdigital.TV.TV;

public class Test {
    public static void main(String[] args) {
        Factory haier = new Haier();
        TV tv = haier.createTV();
        Conditioner conditioner = haier.createConditioner();

        tv.play();
        conditioner.play();
    }
}
