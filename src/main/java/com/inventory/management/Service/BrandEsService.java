package com.inventory.management.Service;

import com.inventory.management.Entity.BrandEsEntity;
import com.inventory.management.Repository.BrandEsRepoImpl;
import com.inventory.management.Repository.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandEsService {

    private final BrandRepo brandRepo;

    public BrandEsService(BrandRepo brandRepo) {
        this.brandRepo = brandRepo;
    }

    @Autowired
    public BrandEsService(BrandEsRepoImpl brandRepo){
        this.brandRepo= brandRepo;
    }

    public void addBrand(final BrandEsEntity brandEsEntity){
        brandRepo.addBrand(brandEsEntity);
    }

    public BrandEsEntity findById(final String id){
        return brandRepo.findById(id).orElse(null);
    }

}
