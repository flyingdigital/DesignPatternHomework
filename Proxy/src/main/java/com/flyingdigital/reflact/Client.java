package com.flyingdigital.reflact;

// 动态代理
public class Client {
    public static void main(String[] args) {
        Host host = new Host();

        ProxyHandler proxyHandler = new ProxyHandler(host);

        Rent rent = (Rent) proxyHandler.getProxy();

        rent.rent();
    }
}
