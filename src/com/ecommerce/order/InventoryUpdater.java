package com.ecommerce.order;

public class InventoryUpdater implements OrderObserver {

    @Override
    public void onStatusChanged(OrderStatus status) {
        System.out.println("Inventory system notified: " + status);
    }
}
