package com.inventory.management.Repository;

import com.inventory.management.Entity.BrandEntity;

public interface BrandRepo {
    public BrandEntity findById(String id) ;
    public BrandEntity addBrand(BrandEntity newBrand);
    public void deleteById(String id);

}



