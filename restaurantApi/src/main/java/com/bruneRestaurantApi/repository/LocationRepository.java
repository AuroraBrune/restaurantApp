package com.bruneRestaurantApi.repository;

import com.bruneRestaurantApi.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
