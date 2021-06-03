package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.MenuGroup;
import com.bruneRestaurantApi.entity.MenuSubGroup;
import com.bruneRestaurantApi.service.MenuSubGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menuSubGroup")
public class MenuSubGroupController {
    @Autowired
    private MenuSubGroupService service;

    @PostMapping("/addMenuSubGroup")
    public MenuSubGroup addMenuSubGroup(@RequestBody MenuSubGroup menuSubGroup){
        return service.saveMenuSubGroup(menuSubGroup);
    }

    @PostMapping("/addMenuSubGroups")
    public List<MenuSubGroup> addMenuSubGroups(@RequestBody List<MenuSubGroup> menuSubGroups){
        return service.saveMenuSubGroups(menuSubGroups);
    }

    @GetMapping("/findMenuSubGroups")
    public List<MenuSubGroup> findAllMenuSubGroups(){
        return service.getMenuSubGroups();
    }

    @GetMapping("/findMenuSubGroupById/{id}")
    public MenuSubGroup getMenuSubGroupById(@PathVariable int id){ return service.getMenuSubGroupsById(id); }

    @PutMapping("/updateMenuSubGroup")
    public MenuSubGroup updateMenuSubGroup(@RequestBody MenuSubGroup menuGroup){ return service.updateMenuSubGroup(menuGroup); }

    @DeleteMapping("/delete/{id}")
    public String deleteMenuSubGrouop(@PathVariable int id){ return service.deleteMenuSubGroup(id);
    }

}
