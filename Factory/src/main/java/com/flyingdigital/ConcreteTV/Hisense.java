package com.flyingdigital.ConcreteTV;

import com.flyingdigital.TV.AbstractTV;

public class Hisense extends AbstractTV {
    @Override
    public void play() {
        System.out.println("海信电视机播放");
    }
}
