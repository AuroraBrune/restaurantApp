package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.MenuGroup;
import com.bruneRestaurantApi.repository.MenuGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuGroupService {

    @Autowired
    private MenuGroupRepository repository;

    public  MenuGroup saveMenuGroup(MenuGroup menuGroup){
        return repository.save(menuGroup);
    }

    public List<MenuGroup> saveMenuGroups(List<MenuGroup> menuGroups){
        return repository.saveAll(menuGroups);
    }

    public List<MenuGroup> getMenuGroups(){
        return repository.findAll();
    }

    public MenuGroup getMenuGroupById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteMenuGroup(int id){
        repository.deleteById(id);
        return "Menu group removed " + id;
    }

    public MenuGroup updateMenuGroup(MenuGroup menuGroup){
        MenuGroup existingMenuGroup=repository.findById(menuGroup.getId()).orElse(null);
        assert existingMenuGroup != null;
        existingMenuGroup.setGroupName(menuGroup.getGroupName());
        existingMenuGroup.setGroupSeqNum(menuGroup.getGroupSeqNum());
        existingMenuGroup.setGroupStatus(menuGroup.getGroupStatus());
        return repository.save(existingMenuGroup);
    }
}