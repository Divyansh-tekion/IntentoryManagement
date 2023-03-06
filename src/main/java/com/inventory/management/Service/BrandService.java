package com.inventory.management.Service;

import com.inventory.management.Entity.BrandEntity;
import com.inventory.management.Entity.ItemEntity;
import com.inventory.management.Repository.BrandRepo;
import com.inventory.management.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    private BrandRepo brandRepo;

    @Autowired
    private ItemRepo itemRepo;

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

    public List<BrandEntity> getBrandByName(String name){
        return brandRepo.findAllByName(name);
    }

    public  List<ItemEntity> getAllItemsByBrandName(String brandName) throws Exception{
        List<BrandEntity> brand= getBrandByName(brandName);
        if(brand.isEmpty())
            throw new Exception("brand not found");
        return itemRepo.findAllByBrand(brand.get(0).getId());
    }
}
