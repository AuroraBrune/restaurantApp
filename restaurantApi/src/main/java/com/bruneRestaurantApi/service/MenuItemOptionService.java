package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.MenuItemOption;
import com.bruneRestaurantApi.repository.MenuItemOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuItemOptionService {

    @Autowired
    private MenuItemOptionRepository repository;

    public MenuItemOption saveMenuItemOption(MenuItemOption menuItemOption) {
        return repository.save(menuItemOption);
    }

    public List<MenuItemOption> saveMenuItemOptions(List<MenuItemOption> menuItemOptions) {
        return repository.saveAll(menuItemOptions);
    }

    public List<MenuItemOption> getMenuItemOptions() {
        return repository.findAll();
    }

    public MenuItemOption getMenuItemOptionById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteMenuItemOption(int id) {
        repository.deleteById(id);
        return "Menu item option removed " + id;
    }

    public MenuItemOption updateMenuItemOption(MenuItemOption menuItemOption) {
        MenuItemOption existingMenuItemOption = repository.findById(menuItemOption.getId()).orElse(null);
        assert existingMenuItemOption != null;
        existingMenuItemOption.setOptionName(menuItemOption.getOptionName());
        existingMenuItemOption.setPrice(menuItemOption.getPrice());
        existingMenuItemOption.setStatus(menuItemOption.getStatus());
        return repository.save(existingMenuItemOption);
    }
}