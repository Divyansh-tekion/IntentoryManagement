package com.inventory.management.Controller;

import com.inventory.management.Entity.BrandEntity;
import com.inventory.management.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private BrandService brandService;

    @PostMapping("/createbrand")
    public String addBrand(@RequestBody BrandEntity newBrand){
       return brandService.addBrand(newBrand);
    };

    @DeleteMapping("/deletebrand/{brandId}")
    public String deleteBrand(@PathVariable String brandId){
        return brandService.deleteBrand(brandId);
    };

    @GetMapping("/getbrands")
    public List<BrandEntity> getAllBrands(){
        return brandService.getAllBrands();
    }
}
