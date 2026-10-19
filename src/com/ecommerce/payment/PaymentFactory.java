package com.ecommerce.payment;

public abstract class PaymentFactory {

    public abstract Payment createPayment();

    public void processPayment(double amount) {
        Payment payment = createPayment();
        payment.pay(amount);
    }
}
