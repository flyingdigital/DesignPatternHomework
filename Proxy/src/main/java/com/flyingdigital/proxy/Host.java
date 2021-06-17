package com.flyingdigital.proxy;

public class Host implements RentHouse {
    @Override
    public void rent() {
        /**
         * 现实情况可能时房东会把自己房子的信息附加上去 等等
         */
        System.out.println("我有房子出租");
    }
}
