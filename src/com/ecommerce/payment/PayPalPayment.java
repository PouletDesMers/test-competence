package com.ecommerce.payment;

public class PayPalPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.printf("Paiement PayPal : %.2f EUR%n", amount);
    }
}
