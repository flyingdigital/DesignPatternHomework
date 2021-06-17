package com.flyingdigital;

public class DogAdapter extends Dog implements Robot {
    @Override
    public void say() {
        System.out.println("机器人: ");
        super.wang();
    }
}
