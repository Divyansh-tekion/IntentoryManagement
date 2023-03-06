package com.inventory.management.Repository;

import com.inventory.management.Entity.BrandEntity;
import com.inventory.management.Entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface BrandRepo extends MongoRepository<BrandEntity,String> {
    public Optional <BrandEntity> findByName(String name);
    public List<BrandEntity> findAllByName(String name);
}
