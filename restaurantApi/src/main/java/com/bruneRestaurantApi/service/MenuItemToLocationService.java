package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.MenuItem;
import com.bruneRestaurantApi.entity.MenuItemToLocation;
import com.bruneRestaurantApi.repository.MenuItemToLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemToLocationService {

    @Autowired
    private MenuItemToLocationRepository repository;

    public MenuItemToLocation saveMenuItemToLocation(MenuItemToLocation menuItemToLocation) {
        return repository.save(menuItemToLocation);
    }

    public List<MenuItemToLocation> saveMenuItemToLocations(List<MenuItemToLocation> menuItemToLocations) {
        return repository.saveAll(menuItemToLocations);
    }

    public List<MenuItemToLocation> getMenuItemToLocations() { return repository.findAll(); }

    public MenuItemToLocation getMenuItemToLocationById(int id) { return repository.findById(id).orElse(null); }

    public String deleteMenuItemToLocation(int id) {
        repository.deleteById(id);
        return "Menu item to location " + id;
    }

    public MenuItemToLocation updateMenuItemToLocation(MenuItemToLocation menuItemToLocation) {
        MenuItemToLocation existingMenuItemToLocation=repository.findById(menuItemToLocation.getId()).orElse(null);
        assert existingMenuItemToLocation != null;
        existingMenuItemToLocation.setMenuItemId(menuItemToLocation.getMenuItemId());
        existingMenuItemToLocation.setLocationId(menuItemToLocation.getLocationId());
        existingMenuItemToLocation.setStatus(menuItemToLocation.getStatus());
        return repository.save(existingMenuItemToLocation);
    }
}
