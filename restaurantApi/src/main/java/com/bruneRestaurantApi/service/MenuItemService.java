package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.MenuItem;
import com.bruneRestaurantApi.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository repository;

    public MenuItem saveMenuItem(MenuItem menuItem) {
        return repository.save(menuItem);
    }
    public List<MenuItem> saveMenuItems(List<MenuItem> menuItems) { return repository.saveAll(menuItems); }

    public List<MenuItem> getMenuItems() { return repository.findAll(); }

    public MenuItem getMenuItemById(int id) { return repository.findById(id).orElse( null); }

    public String deleteMenuItem(int id) {
        repository.deleteById(id);
        return "Menu item removed " + id;
    }

    public MenuItem updateMenuItem(MenuItem menuItem) {
        MenuItem existingMenuItem=repository.findById(menuItem.getId()).orElse(null);
        assert existingMenuItem !=null;
        existingMenuItem.setMenuItemName(menuItem.getMenuItemName());
        existingMenuItem.setDescription(menuItem.getDescription());
        existingMenuItem.setPrice(menuItem.getPrice());
        existingMenuItem.setActive(menuItem.isActive());
        return repository.save(existingMenuItem);
    }
}
