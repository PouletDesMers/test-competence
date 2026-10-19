package com.ecommerce.payment.adapter;

public class ExternalPaymentGateway {

    public void makeTransaction(double amount) {
        System.out.println("External payment: " + amount);
    }
}
