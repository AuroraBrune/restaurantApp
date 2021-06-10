package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.MenuSubGroup;
import com.bruneRestaurantApi.repository.MenuSubGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuSubGroupService {

    @Autowired
    private MenuSubGroupRepository repository;

    public MenuSubGroup saveMenuSubGroup(MenuSubGroup menuSubGroup) {
        return repository.save(menuSubGroup);
    }

    public List<MenuSubGroup> saveMenuSubGroups(List<MenuSubGroup> menuSubGroups) {
        return repository.saveAll(menuSubGroups);
    }

    public List<MenuSubGroup> getMenuSubGroups() {
        return repository.findAll();
    }

    public MenuSubGroup getMenuSubGroupById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteMenuSubGroup(int id) {
        repository.deleteById(id);
        return "Menu sub group removed " + id;
    }

    public MenuSubGroup updateMenuSubGroup(MenuSubGroup menuSubGroup) {
        MenuSubGroup existingMenuSubGroup=repository.findById(menuSubGroup.getId()).orElse(null);
        assert existingMenuSubGroup != null;
        existingMenuSubGroup.setSubGroupName(menuSubGroup.getSubGroupName());
        existingMenuSubGroup.setSubGroupSequenceNumber(menuSubGroup.getSubGroupSequenceNumber());
        return repository.save(existingMenuSubGroup);
    }
}
