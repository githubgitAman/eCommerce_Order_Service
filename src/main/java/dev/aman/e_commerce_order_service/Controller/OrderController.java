package dev.aman.e_commerce_order_service.Controller;

import dev.aman.e_commerce_order_service.DTOs.OrderDTOs;
import dev.aman.e_commerce_order_service.Services.OrderService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/{orders}")
public class OrderController {

    private OrderService orderService;
    public OrderController(@Qualifier("SelfOrderService") OrderService orderService) {
        this.orderService = orderService;
    }

    //Add product
    @PostMapping("/{add}")
    public OrderDTOs addOrder(@RequestBody OrderDTOs orderDtos){
        return null;
    }
    //Update product
    @PatchMapping("/{update}")
    public OrderDTOs updateOrder(@RequestBody OrderDTOs orderDtos){
        return null;
    }
    //Delete product
    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id){
        return null;
    }
    //Find product
    @GetMapping("/{id}")
    public OrderDTOs getProductById(@PathVariable Long id){
        return null;
    }
}
