package com.ecommerce.payment;

public class PaymentService {

    private final PaymentFactory factory;

    public PaymentService(PaymentFactory factory) {
        this.factory = factory;
    }

    public void checkout(double amount) {
        Payment payment = factory.createPayment();
        payment.pay(amount);
    }
}
