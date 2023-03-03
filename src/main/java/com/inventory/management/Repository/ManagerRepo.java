package com.inventory.management.Repository;

import com.inventory.management.Entity.ManagerEntity;
import com.inventory.management.Entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManagerRepo extends MongoRepository<ManagerEntity,String> {
}
