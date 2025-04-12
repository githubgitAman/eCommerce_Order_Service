package dev.aman.e_commerce_order_service.Services;

import jakarta.persistence.criteria.Order;

public interface OrderService {

    String addOrder(Order order);
    String updateOrder(Order order);
    String deleteOrder(String orderId);
    Order getOrder(String orderId);
}
