package com.inventory.management.Service;

import com.inventory.management.Entity.BrandEntity;
import com.inventory.management.Repository.BrandRepo;
import com.inventory.management.Repository.ItemRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BrandService {


    private final BrandRepo brandRepo;

    public BrandService(BrandRepo brandRepo) {
        this.brandRepo = brandRepo;
    }


    public String addBrand(BrandEntity newBrand){
        brandRepo.addBrand(newBrand);
        return "Brand added successfully";
    };

    public String deleteBrand(String brandId){
        brandRepo.deleteById(brandId);
        return "Brand removed successfully";
    };

    public Optional<BrandEntity> findById(String id){
        return brandRepo.findById(id);
    };

//    public List<BrandEntity> getBrandByName(String name){
//        return brandMongoRepoImpl.findAllByName(name);
//    }
//
//    public  List<ItemEntity> getAllItemsByBrandName(String brandName) throws Exception{
//        List<BrandEntity> brand= getBrandByName(brandName);
//        if(brand.isEmpty())
//            throw new Exception("brand not found");
//        return itemRepo.findAllByBrand(brand.get(0).getId());
//    }
}
