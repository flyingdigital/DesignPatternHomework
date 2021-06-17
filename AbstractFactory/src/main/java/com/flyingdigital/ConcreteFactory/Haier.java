package com.flyingdigital.ConcreteFactory;

import com.flyingdigital.AbstractFactory.Factory;
import com.flyingdigital.ConcreteConditioner.HaierConditioner;
import com.flyingdigital.ConcreteConditioner.TCLConditioner;
import com.flyingdigital.ConcreteTV.HaierTV;
import com.flyingdigital.Conditioner.Conditioner;
import com.flyingdigital.TV.TV;

public class Haier extends Factory {
    @Override
    public TV createTV() {
        return new HaierTV();
    }

    @Override
    public Conditioner createConditioner() {
        return new HaierConditioner();
    }
}
