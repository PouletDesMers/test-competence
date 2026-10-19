package com.ecommerce.order;

public interface OrderObserver {

    void onStatusChanged(OrderStatus status);
}
