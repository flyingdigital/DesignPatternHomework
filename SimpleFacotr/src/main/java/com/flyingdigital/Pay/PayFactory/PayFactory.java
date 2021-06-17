package com.flyingdigital.Pay.PayFactory;

import com.flyingdigital.Pay.AbstractPay.AbstractPay;
import com.flyingdigital.Pay.ConcretePay.CashPay;
import com.flyingdigital.Pay.ConcretePay.CreditCardPay;

public class PayFactory {
    public static AbstractPay createPay(String arg){
        if(arg.equalsIgnoreCase("cashpay")){
            return new CashPay();
        }else if(arg.equalsIgnoreCase("creditcardpay")) {
            return new CreditCardPay();
        }else{
            return null;
        }
    }
}
