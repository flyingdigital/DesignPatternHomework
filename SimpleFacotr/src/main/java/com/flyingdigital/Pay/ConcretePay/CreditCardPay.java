package com.flyingdigital.Pay.ConcretePay;

import com.flyingdigital.Pay.AbstractPay.AbstractPay;

public class CreditCardPay extends AbstractPay {
    @Override
    public void pay() {
        System.out.println("使用信用卡直复");
    }
}
