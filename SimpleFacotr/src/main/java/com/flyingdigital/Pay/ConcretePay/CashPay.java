package com.flyingdigital.Pay.ConcretePay;

import com.flyingdigital.Pay.AbstractPay.AbstractPay;

public class CashPay extends AbstractPay {
    @Override
    public void pay() {
        System.out.println("使用现金支付");
    }
}
