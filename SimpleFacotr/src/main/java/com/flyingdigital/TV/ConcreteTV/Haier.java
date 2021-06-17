package com.flyingdigital.TV.ConcreteTV;

import com.flyingdigital.TV.AbstractTV.AbstractTV;

public class Haier extends AbstractTV {
    @Override
    public void play() {
        System.out.println("获取海尔电视");
    }
}
