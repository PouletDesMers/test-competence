package com.ecommerce.payment;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        PaymentService cardService = new PaymentService(new CardPaymentFactory());
        PaymentService paypalService = new PaymentService(new PayPalPaymentFactory());

        cardService.checkout(149.99);
        paypalService.checkout(89.50);
    }
}
