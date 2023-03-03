package com.inventory.management.Controller;

import com.inventory.management.Entity.ItemEntity;
import com.inventory.management.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/getitems")
    public List<ItemEntity> getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping("/additem")
    public String addItem(@RequestBody ItemEntity newItem){
        return itemService.addItem(newItem);
    };

    @DeleteMapping("/deleteitem/{itemId}")
    public String deleteItem(@PathVariable String itemId){
        return itemService.deleteItem(itemId);
    };
 }
