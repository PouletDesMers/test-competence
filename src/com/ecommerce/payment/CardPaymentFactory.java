package com.ecommerce.payment;

public class CardPaymentFactory extends PaymentFactory {

    @Override
    public Payment createPayment() {
        return new CardPayment();
    }
}
