package com.flyingdigital.ConcreteConditioner;

import com.flyingdigital.Conditioner.Conditioner;

public class HaierConditioner extends Conditioner {

    @Override
    public void play() {
        System.out.println("海尔空调正在工作！");
    }
}
