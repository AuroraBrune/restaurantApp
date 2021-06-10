package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.MenuItem;
import com.bruneRestaurantApi.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menuItem")

public class MenuItemController {

    @Autowired
    private MenuItemService service;

    @PostMapping("/addMenuItem")
    public MenuItem addMenuItem(@RequestBody MenuItem menuItem) { return service.saveMenuItem(menuItem); }

    @PostMapping("/addMenuItems")
    public List<MenuItem> addMenuItems(@RequestBody List<MenuItem> menuItems) {
        return service.saveMenuItems(menuItems);
    }

    @GetMapping("/findMenuItems")
    public List<MenuItem> findAllMenuItems() { return service.getMenuItems(); }

    @GetMapping("/findMenuItemById/{id}")
    public MenuItem getMenuItemById(@PathVariable int id) {
        return service.getMenuItemById(id);
    }

    @PutMapping("/updateMenuItem")
    public MenuItem updateMenuItem(@RequestBody MenuItem menuItem) {
        return service.updateMenuItem(menuItem);
    };

    @DeleteMapping("/delete{id}")
    public String deleteMenuItem(@PathVariable int id) {
        return service.deleteMenuItem(id);
    }

}
