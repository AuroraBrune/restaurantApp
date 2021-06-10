package com.bruneRestaurantApi.repository;

import com.bruneRestaurantApi.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
