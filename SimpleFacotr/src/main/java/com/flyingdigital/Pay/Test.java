package com.flyingdigital.Pay;

import com.flyingdigital.Pay.AbstractPay.AbstractPay;
import com.flyingdigital.Pay.PayFactory.PayFactory;

public class Test {
    public static void main(String[] args) {
        AbstractPay abstractPay = PayFactory.createPay("cashpay");
        if(abstractPay==null)
            System.out.println("不支持这种支付方式");
        else
            abstractPay.pay();
    }
}
