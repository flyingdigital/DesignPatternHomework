package com.flyingdigital;

public class GeneralSwitchFacade {
    Light[] lights;
    Fan fan;
    AirConditioner airConditioner;
    Television tv;

    public GeneralSwitchFacade(){
        lights = new Light[4];
        lights[0] = new Light("左前");
        lights[1] = new Light("右前");
        lights[2] = new Light("左后");
        lights[3] = new Light("右后");

        fan = new Fan();

        airConditioner = new AirConditioner();

        tv = new Television();
    }

    public void on(){
        for(Light light: lights){
            light.on();
        }
        fan.on();
        airConditioner.on();
        tv.on();

    }
    public void off(){
        for(Light light: lights){
            light.off();
        }
        fan.off();
        airConditioner.off();
        tv.off();
    }
}
