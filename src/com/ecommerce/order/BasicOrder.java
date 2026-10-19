package com.ecommerce.order;

public class BasicOrder implements OrderCost {

    private static final double BASE_COST = 100.00;

    @Override
    public double getCost() {
        return BASE_COST;
    }
}
