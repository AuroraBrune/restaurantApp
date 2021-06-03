package com.bruneRestaurantApi.controller;
import com.bruneRestaurantApi.entity.GroupSubGroup;
import com.bruneRestaurantApi.entity.MenuGroup;
import com.bruneRestaurantApi.service.GroupSubGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/groupSubGroup")
public class GroupSubGroupController {
    @Autowired
    private GroupSubGroupService service;

    @PostMapping("/addGroupSubGroup")
    public GroupSubGroup addGroupSubGroup(@RequestBody GroupSubGroup groupSubGroup) {
        return service.saveGroupSubGroup(groupSubGroup);
    }

    @PostMapping("/addGroupSubGroups")
    public List<GroupSubGroup> addGroupSubGroups(@RequestBody List<GroupSubGroup> groupSubGroups) {
        return service.saveGroupSubGroups(groupSubGroups);
    }

    @GetMapping("/findGroupSubGroups")
    public List<GroupSubGroup> findAllGroupSubGroups(){
        return service.getGroupSubGroups();
    }

    @GetMapping("/findGroupSubGroupById/{id}")
    public GroupSubGroup getGroupSubGroupById(@PathVariable int id){ return service.getGroupSubGroupById(id); }

    @PutMapping("/updateGroupSubGroup")
    public GroupSubGroup updateGroupSubGroup(@RequestBody GroupSubGroup groupSubGroup){ return service.updateGroupSubGroup(groupSubGroup); }

    @DeleteMapping("/delete/{id}")
    public String deleteGroupSubGrouop(@PathVariable int id){ return service.deleteGroupSubGroup(id);
    }
}
