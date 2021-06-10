package com.bruneRestaurantApi.service;

import com.bruneRestaurantApi.entity.ItemOption;
import com.bruneRestaurantApi.repository.ItemOptionRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemOptionService {

    @Autowired
    private ItemOptionRepository repository;

    public ItemOption saveItemOption(ItemOption itemOption) {
        return repository.save(itemOption);
    }

    public List<ItemOption> saveItemOptiohns(List<ItemOption> itemOptions) { return repository.saveAll(itemOptions); }

    public List<ItemOption> getItemOptions() { return repository.findAll(); }

    public ItemOption getItemOptionById(int id) { return repository.findById(id).orElse(null); }

    public String deleteItemOption(int id) {
        repository.deleteById(id);
        return "Item option removed " + id;
    }

    public ItemOption updateItemOption(ItemOption itemOption) {
        ItemOption existingItemOption=repository.findById(itemOption.getId()).orElse(null);
        assert existingItemOption != null;
        existingItemOption.setMenuItemId(itemOption.getMenuItemId());
        existingItemOption.setMenuOptionId(itemOption.getMenuOptionId());
        return repository.save(existingItemOption);
    }
}
