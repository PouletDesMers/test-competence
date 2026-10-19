package com.ecommerce.order;

public abstract class OrderDecorator implements OrderCost {

    private final OrderCost order;

    protected OrderDecorator(OrderCost order) {
        this.order = order;
    }

    protected OrderCost order() {
        return order;
    }

    @Override
    public double getCost() {
        return order.getCost();
    }
}
