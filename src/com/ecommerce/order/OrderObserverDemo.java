package com.ecommerce.order;

public class OrderObserverDemo {

    public static void main(String[] args) {
        Order order = new Order();
        OrderObserver customer = new CustomerNotifier();
        OrderObserver inventory = new InventoryUpdater();

        order.attach(customer);
        order.attach(inventory);

        order.changeStatus(OrderStatus.SHIPPED);

        order.detach(customer);
        order.changeStatus(OrderStatus.DELIVERED);
    }
}
