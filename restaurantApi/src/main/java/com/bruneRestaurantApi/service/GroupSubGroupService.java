package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.GroupSubGroup;
import com.bruneRestaurantApi.repository.GroupSubGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroupSubGroupService {
    @Autowired
    private GroupSubGroupRepository repository;

    public GroupSubGroup saveGroupSubGroup(GroupSubGroup groupSubGroup) {
        return repository.save(groupSubGroup);
    }

    public List<GroupSubGroup> saveGroupSubGroups(List<GroupSubGroup> groupSubGroups) {
        return repository.saveAll(groupSubGroups);
    }

    public List<GroupSubGroup> getGroupSubGroups() { return repository.findAll();
    }

    public GroupSubGroup getGroupSubGroupById(int id) { return repository.findById(id).orElse(null);
    }

    public GroupSubGroup updateGroupSubGroup(GroupSubGroup groupSubGroup) { return repository.save(groupSubGroup);
    }

    public String deleteGroupSubGroup(int id) { repository.deleteById(id);
        return "Menu group removed " + id;
    }
}
