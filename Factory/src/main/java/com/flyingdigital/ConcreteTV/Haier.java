package com.flyingdigital.ConcreteTV;

import com.flyingdigital.TV.AbstractTV;

public class Haier extends AbstractTV {
    @Override
    public void play() {
        System.out.println("海尔电视机播放");
    }
}
