package com.ecommerce.order;

public class DecoratorDemo {

    public static void main(String[] args) {
        OrderCost basic = new BasicOrder();
        OrderCost wrapped = new GiftWrappingDecorator(new BasicOrder());
        OrderCost wrappedExpress = new ExpressDeliveryDecorator(new GiftWrappingDecorator(new BasicOrder()));

        System.out.println("Basic Order: " + basic.getCost() + " EUR");
        System.out.println("With Gift Wrapping: " + wrapped.getCost() + " EUR");
        System.out.println("With Gift Wrapping Express Delivery: " + wrappedExpress.getCost() + " EUR");
    }
}
