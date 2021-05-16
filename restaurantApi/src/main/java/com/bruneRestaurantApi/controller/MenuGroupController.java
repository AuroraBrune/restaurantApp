package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.MenuGroup;
import com.bruneRestaurantApi.service.MenuGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menuGroup")
public class MenuGroupController {

    @Autowired
    private MenuGroupService service;

    @PostMapping("/addMenuGroup")
    public MenuGroup addMenuGroup(@RequestBody MenuGroup menuGroup){
        return service.saveMenuGroup(menuGroup);
    }

    @PostMapping("/addMenuGroups")
    public List<MenuGroup> addMenuGroups(@RequestBody List<MenuGroup> menuGroups){
        return service.saveMenuGroups(menuGroups);
    }

    @GetMapping("/findMenuGroups")
    public List<MenuGroup> findAllMenuGroups(){
        return service.getMenuGroups();
    }

    @GetMapping("/findMenuGroupById/{id}")
    public MenuGroup getMenuGroupById(@PathVariable int id){ return service.getMenuGrouopById(id); }

    @PutMapping("/updateMenuGroup")
    public MenuGroup updateMenuGroup(@RequestBody MenuGroup menuGroup){ return service.updateMenuGroup(menuGroup); }

    @DeleteMapping("/delete/{id}")
    public String deleteMenuGrouop(@PathVariable int id){ return service.deleteMenuGroup(id);
    }

}
