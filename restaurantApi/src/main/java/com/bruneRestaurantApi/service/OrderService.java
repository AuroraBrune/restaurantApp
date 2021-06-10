package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.Order;
import com.bruneRestaurantApi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order saveOrder(Order order) {
        return repository.save(order);
    }
    public List<Order> saveOrders(List<Order> orders) { return repository.saveAll(orders); }

    public Order getOrderById(int id) { return repository.findById(id).orElse(null); }

    public String deleteOrder(int id) {
        repository.deleteById(id);
        return "Order removed " + id;
    }

    public Order updateOrder(Order order) {
        Order existingOrder=repository.findById(order.getId()).orElse(null);
        assert existingOrder != null;
        existingOrder.setCustomerId(order.getCustomerId());
        existingOrder.setTotalItemsPrice(order.getTotalItemsPrice());
        existingOrder.setTax(order.getTax());
        existingOrder.setTip(order.getTip());
        existingOrder.setTotalDue(order.getTotalDue());
        existingOrder.setBillingType(order.getBillingType());
        return repository.save(existingOrder);
    }
}
