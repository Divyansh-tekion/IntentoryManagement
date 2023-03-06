package com.inventory.management.Service;

import com.inventory.management.Entity.CustomerEntity;
import com.inventory.management.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public String addCustomer(CustomerEntity newCustomer){
        customerRepo.save(newCustomer);
        return "Customer added successfully";
    };
}
