package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.OrderItem;
import com.bruneRestaurantApi.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

    @Autowired
    private OrderItemService service;

    @PostMapping("/addOrderItem")
    public OrderItem addOrderItem(@RequestBody OrderItem orderItem) { return service.saveOrderItem(orderItem); }

    @PostMapping("/addOrderItems")
    public List<OrderItem> addOrderItems(@RequestBody List<OrderItem> orderItems) {
        return service.saveOrderItems(orderItems);
    }

    @GetMapping("/findOrderItems")
    public List<OrderItem> findAllOrderItem() { return service.getOrderItems(); }

    @GetMapping("/findOrderItemById/{id}")
    public OrderItem getOrderItemById(@PathVariable int id) {
        return service.getOrderItemById(id);
    }

    @PutMapping("/updateOrderItem")
    public OrderItem updateOrderItem(@RequestBody OrderItem orderItem) {
        return service.updateOrderItem(orderItem);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrderItem(@PathVariable int id) {
        return service.deleteOrderItem(id);
    }

}
