package com.ecommerce.order;

public class GiftWrappingDecorator extends OrderDecorator {

    private static final double GIFT_WRAPPING_COST = 5.00;

    public GiftWrappingDecorator(OrderCost order) {
        super(order);
    }

    @Override
    public double getCost() {
        return super.getCost() + GIFT_WRAPPING_COST;
    }
}
