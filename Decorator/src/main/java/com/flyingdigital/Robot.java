package com.flyingdigital;

public class Robot extends  Changer {
    public Robot(Transform transform) {
        super(transform);
    }

    public void say(){
        System.out.println("说话");
    }
}
