package com.ecommerce.payment.adapter;

import com.ecommerce.payment.Payment;

public class AdapterDemo {

    public static void main(String[] args) {
        ExternalPaymentGateway gateway = new ExternalPaymentGateway();
        Payment payment = new ExternalPaymentAdapter(gateway);
        payment.pay(250.00);
    }
}
