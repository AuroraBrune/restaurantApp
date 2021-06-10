package com.bruneRestaurantApi.controller;

import com.bruneRestaurantApi.entity.ItemOption;
import com.bruneRestaurantApi.service.ItemOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itemOption")
public class ItemOptionController {

    @Autowired
    private  ItemOptionService service;

    @PostMapping("/addItemOption")
    public ItemOption addItemOption(@RequestBody ItemOption itemOption) { return service.saveItemOption(itemOption); }

    @PostMapping("/addItemOptions")
    public List<ItemOption> addItemOptions(@RequestBody List<ItemOption> itemOptions) {
        return service.saveItemOptiohns(itemOptions);
    }

    @GetMapping("/findItemOptions")
    public List<ItemOption> findAllItemOptions() { return service.getItemOptions(); }

    @GetMapping("/findItemOptionById/{id}")
    public ItemOption getItemOptionById(@PathVariable int id) {
        return service.getItemOptionById(id);
    }

    @PutMapping("/updateItemOption")
    public ItemOption updateItemOption(@RequestBody ItemOption itemOption) {
        return service.updateItemOption(itemOption);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteItemOption(@PathVariable int id) {
        return service.deleteItemOption(id);
    }
}
