package com.inventory.management.Service;

import com.inventory.management.Entity.ItemEntity;
import com.inventory.management.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public String addItem(ItemEntity newItem){
        itemRepo.save(newItem);
        return "Item added successfully";
    }

    public List<ItemEntity> getAllItems(){
        return itemRepo.findAll();
    }

    public String deleteItem(String itemId){
        itemRepo.deleteById(itemId);
        return "Item Deleted successfully";
    };
}
