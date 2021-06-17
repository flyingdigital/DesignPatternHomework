package com.flyingdigital;

public class Light {
    String position;

    public Light(String position) {
        this.position = position;
    }

    public void on(){
        System.out.println(position+"电灯打开");
    }
    public void off(){
        System.out.println(position+"电灯关闭");
    }
}
