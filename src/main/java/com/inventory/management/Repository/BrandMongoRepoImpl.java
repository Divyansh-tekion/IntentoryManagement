package com.inventory.management.Repository;

import com.inventory.management.Entity.BrandEntity;
import org.springframework.data.mongodb.core.MongoTemplate;

public class BrandMongoRepoImpl  implements BrandRepo {
//    public Optional <BrandEntity> findByName(String name);
//    public List<BrandEntity> findAllByName(String name);
//
//    public void deleteByName(String name);
    private final MongoTemplate mongoTemplate;

    public BrandMongoRepoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public BrandEntity findById(String id) {
        return (mongoTemplate.findById(id, BrandEntity.class);
    }
    @Override
    public BrandEntity addBrand(BrandEntity newBrand) {
        return mongoTemplate.save(newBrand);
    }

    @Override
    public void deleteById(String id) {
      mongoTemplate.remove(findById(id).get());
    }


}
