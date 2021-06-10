package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.MenuItemOption;
import com.bruneRestaurantApi.service.MenuItemOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menuItemOption")
public class MenuItemOptionController {

    @Autowired
    private MenuItemOptionService service;

    @PostMapping("/addMenuItemOption")
    public MenuItemOption addMenuItemOption(@RequestBody MenuItemOption menuItemOption) {
        return service.saveMenuItemOption(menuItemOption);
    }

    @PostMapping("/addMenuItemOptions")
    public List<MenuItemOption> addMenuItemOptions(@RequestBody List<MenuItemOption> menuItemOptions)
    { return service.saveMenuItemOptions(menuItemOptions); }

    @GetMapping("/findMenuItemOptions")
    public List<MenuItemOption> findAllMenuItemOptions() { return service.getMenuItemOptions(); }

    @GetMapping("/findMenuItemById/{id}")
    public MenuItemOption getMenuItemOptionById(@PathVariable int id) {
        return service.getMenuItemOptionById(id);
    }

    @PutMapping("/updateMenuItemOption")
    public MenuItemOption updateMenuItemOption(@RequestBody MenuItemOption menuItemOption) {
        return service.updateMenuItemOption(menuItemOption);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMenuItemOption(@PathVariable int id) {
        return service.deleteMenuItemOption(id);
    }
}
