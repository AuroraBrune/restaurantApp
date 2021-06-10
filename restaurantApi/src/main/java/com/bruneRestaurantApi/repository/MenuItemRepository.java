package com.bruneRestaurantApi.repository;

import com.bruneRestaurantApi.entity.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer> {

}

