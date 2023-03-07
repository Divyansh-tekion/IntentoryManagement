package com.inventory.management.Controller;

import com.inventory.management.Entity.BrandEsEntity;
import com.inventory.management.Service.BrandEsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/es/brand")
public class BrandEsController {
    private final BrandEsService brandEsService;

    @Autowired
    public BrandEsController(BrandEsService brandEsService){
        this.brandEsService=brandEsService;
    }

    @PostMapping
    public void addBrand(@RequestBody final BrandEsEntity brandEsEntity){
        brandEsService.addBrand(brandEsEntity);
    }

    @GetMapping("/{id}")
    public BrandEsEntity findById(@PathVariable final String id){
        return brandEsService.findById(id);
    }
}
