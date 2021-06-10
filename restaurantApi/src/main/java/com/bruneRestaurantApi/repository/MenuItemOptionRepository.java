package com.bruneRestaurantApi.repository;

import com.bruneRestaurantApi.entity.MenuItemOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuItemOptionRepository extends JpaRepository<MenuItemOption, Integer> {

}
