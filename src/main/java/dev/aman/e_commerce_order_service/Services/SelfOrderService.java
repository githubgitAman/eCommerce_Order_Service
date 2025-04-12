package dev.aman.e_commerce_order_service.Services;

import jakarta.persistence.criteria.Order;
import org.springframework.stereotype.Service;

@Service("SelfOrderService")
public class SelfOrderService implements OrderService {
    @Override
    public String addOrder(Order order) {
        return "";
    }

    @Override
    public String updateOrder(Order order) {
        return "";
    }

    @Override
    public String deleteOrder(String orderId) {
        return "";
    }

    @Override
    public Order getOrder(String orderId) {
        return null;
    }
}
