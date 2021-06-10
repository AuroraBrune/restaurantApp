package com.bruneRestaurantApi.repository;

import com.bruneRestaurantApi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
