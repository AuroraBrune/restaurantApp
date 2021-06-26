package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.Order;
import com.bruneRestaurantApi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/addOrder")
    public Order addOrder(@RequestBody Order order) {
        return service.saveOrder(order);
    }

    @PostMapping("/addOrders")
    public List<Order> addOrders(@RequestBody List<Order> orders) {
        return service.saveOrders(orders); }

    @GetMapping("/findOrders")
    public List<Order> findAllOrders() { return service.getOrders(); }

    @GetMapping("/findOrderById/{id}")
    public Order getOrderById(@PathVariable int id) {
        return service.getOrderById(id);
    }

    @PutMapping("/updateOrder")
    public Order updateOrder(@RequestBody Order order) {
        return service.updateOrder(order);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable int id) {
        return service.deleteOrder(id);
    }

}
