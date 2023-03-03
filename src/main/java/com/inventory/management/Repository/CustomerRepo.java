package com.inventory.management.Repository;

import com.inventory.management.Entity.CustomerEntity;
import com.inventory.management.Entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<CustomerEntity,String> {
}
