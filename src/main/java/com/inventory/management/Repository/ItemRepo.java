package com.inventory.management.Repository;

import com.inventory.management.Entity.ItemEntity;
import com.inventory.management.Entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ItemRepo extends MongoRepository<ItemEntity,String> {
     public List<ItemEntity> findAllByBrand(String brand_Id);
}
