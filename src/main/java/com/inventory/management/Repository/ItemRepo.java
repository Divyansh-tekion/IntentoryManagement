package com.inventory.management.Repository;

import com.inventory.management.Entity.ItemEntity;
import com.inventory.management.Entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepo extends MongoRepository<ItemEntity,String> {

}
