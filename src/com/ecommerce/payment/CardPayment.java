package com.ecommerce.payment;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.printf("Paiement par carte bancaire : %.2f EUR%n", amount);
    }
}
