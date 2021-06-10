package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.OrderItem;
import com.bruneRestaurantApi.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository repository;

    public OrderItem saveOrderItem(OrderItem orderItem) {
        return repository.save(orderItem);
    }

    public List<OrderItem> saveOrderItems(List<OrderItem> orderItems) {
        return repository.saveAll(orderItems); }

    public List<OrderItem> getOrderItems() {
        return repository.findAll();
    }

     public OrderItem getOrderItemById(int id) {
        return repository.findById(id).orElse(null);
     }

     public String deleteOrderItem(int id) {
        repository.deleteById(id);
        return "Order item removed " + id;
     }

     public OrderItem updateOrderItem(OrderItem orderItem) {
         OrderItem existingOrderItem=repository.findById(orderItem.getId()).orElse(null);
         assert existingOrderItem != null;
         existingOrderItem.setOrderId(orderItem.getOrderId());
         existingOrderItem.setMenuItemId(orderItem.getMenuItemId());
         return repository.save(existingOrderItem);
     }
}
