package com.flyingdigital.TV.ConcreteTV;

import com.flyingdigital.TV.AbstractTV.AbstractTV;

public class Hisense extends AbstractTV {
    @Override
    public void play() {
        System.out.println("获取海信电视");
    }
}
