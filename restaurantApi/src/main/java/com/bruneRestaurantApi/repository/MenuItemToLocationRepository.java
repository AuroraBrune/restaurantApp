package com.bruneRestaurantApi.repository;

import com.bruneRestaurantApi.entity.MenuItemToLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemToLocationRepository extends JpaRepository<MenuItemToLocation, Integer> {

}
