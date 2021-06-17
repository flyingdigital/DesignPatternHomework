package com.flyingdigital.AbstractFactory;

import com.flyingdigital.Conditioner.Conditioner;
import com.flyingdigital.TV.TV;

public abstract class Factory {
    public abstract TV createTV();
    public abstract Conditioner createConditioner();
}