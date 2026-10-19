package com.ecommerce.payment;

public class PayPalPaymentFactory extends PaymentFactory {

    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
