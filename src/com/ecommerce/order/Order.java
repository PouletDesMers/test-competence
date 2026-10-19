package com.ecommerce.order;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<OrderObserver> observers = new ArrayList<>();
    private OrderStatus status;

    public Order() {
        this.status = OrderStatus.CREATED;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void changeStatus(OrderStatus status) {
        this.status = status;
        System.out.println("Order status changed: " + status);
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.onStatusChanged(status);
        }
    }
}
