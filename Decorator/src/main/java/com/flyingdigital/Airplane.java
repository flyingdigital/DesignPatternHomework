package com.flyingdigital;

public class Airplane extends Changer {
    public Airplane(Transform transform) {
        super(transform);
    }

    public void fly(){
        System.out.println("在天空飞翔");
    }
}
