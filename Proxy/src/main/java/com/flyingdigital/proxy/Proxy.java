package com.flyingdigital.proxy;


/**
 * 静态代理
 */
public class Proxy implements RentHouse{

    Host host;

    public  Proxy(){}
    public Proxy(Host host) {
        this.host = host;
    }

    // 中介者往往可以扩充原来的内容
    @Override
    public void rent() {
        System.out.println("看房");
        host.rent();
        System.out.println("签合同");
        System.out.println("收中介费");
    }
}
