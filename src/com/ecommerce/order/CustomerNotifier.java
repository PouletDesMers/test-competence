package com.ecommerce.order;

public class CustomerNotifier implements OrderObserver {

    @Override
    public void onStatusChanged(OrderStatus status) {
        System.out.println("Customer notified: " + status);
    }
}
