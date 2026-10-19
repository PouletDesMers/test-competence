package com.ecommerce.order;

public class ExpressDeliveryDecorator extends OrderDecorator {

    private static final double EXPRESS_DELIVERY_COST = 15.00;

    public ExpressDeliveryDecorator(OrderCost order) {
        super(order);
    }

    @Override
    public double getCost() {
        return super.getCost() + EXPRESS_DELIVERY_COST;
    }
}
