package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.MenuItemToLocation;
import com.bruneRestaurantApi.service.MenuItemToLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menuItemToLocation")
public class MenuItemToLocationController {

    @Autowired
    private MenuItemToLocationService service;

    @PostMapping("/addMenuItemToLocation")
    public MenuItemToLocation addMenuItemToLocation(@RequestBody MenuItemToLocation menuItemToLocation) {
        return service.saveMenuItemToLocation(menuItemToLocation); }

    @PostMapping("/addMenuItemToLocations")
    public List<MenuItemToLocation> addMenuItemToLocation(@RequestBody List<MenuItemToLocation> menuItemToLocations) {
        return service.saveMenuItemToLocations(menuItemToLocations);
    }

    @GetMapping("/findMenuItemToLocations")
    public List<MenuItemToLocation> findAllMenuItemToLocations() { return service.getMenuItemToLocations();
    }

    @GetMapping("/findMenuItemToLocationById/{id}")
    public MenuItemToLocation getMenuItemToLocationById(@PathVariable int id) {
        return service.getMenuItemToLocationById(id);
    }

    @PutMapping("/updateMenuItemToLocation")
    public  MenuItemToLocation updateMenuItemToLocation(@RequestBody MenuItemToLocation menuItemToLocation) {
        return service.updateMenuItemToLocation(menuItemToLocation);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMenuItemToLocation(@PathVariable int id) {
        return service.deleteMenuItemToLocation(id);
    }
}
