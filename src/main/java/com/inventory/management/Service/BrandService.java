package com.inventory.management.Service;

import com.inventory.management.Entity.BrandEntity;
import com.inventory.management.Repository.BrandRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepo brandRepo;
    public String addBrand(BrandEntity newBrand){
        brandRepo.save(newBrand);
        return "Brand added successfully";
    };

    public String deleteBrand(String brandId){
        brandRepo.deleteById(brandId);
        return "Brand removed successfully";
    };

    public List <BrandEntity> getAllBrands(){
        return brandRepo.findAll();
    };
}
