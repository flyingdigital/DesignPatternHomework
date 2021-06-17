package com.flyingdigital.reflact;

public class Host implements Rent{


    @Override
    public void rent() {
        System.out.println("我有房子要租啊！！！");
    }

    @Override
    public void some() {
        System.out.println("我啥也不干");
    }

}
