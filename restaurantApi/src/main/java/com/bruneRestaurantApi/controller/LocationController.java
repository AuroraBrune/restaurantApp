package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.Location;
import com.bruneRestaurantApi.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService service;

    @PostMapping("/addLocation")
    public Location addLocation(@RequestBody Location location) { return service.saveLocation(location); }

    @PostMapping("/addLocations")
    public List<Location> addLocations(@RequestBody List<Location> locations) {
        return service.saveLocations(locations);
    }

    @GetMapping("/findLocation")
    public List<Location> findAllLocation() { return service.getLocations(); }

    @GetMapping("/updateLocation")
    public Location updateLocation(@RequestBody Location location ) {
        return service.updateLocation(location);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteLocation(@PathVariable int id) {
        return service.deleteLocation(id);
    }
}
