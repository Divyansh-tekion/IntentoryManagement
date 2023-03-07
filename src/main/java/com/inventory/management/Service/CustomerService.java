package com.inventory.management.Service;

import com.inventory.management.Entity.CustomerEntity;
import com.inventory.management.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public String addCustomer(CustomerEntity newCustomer){
        customerRepo.save(newCustomer);
        return "new customer is " + newCustomer.toString();
    };

    public String deleteCustomer(String customerId){
        customerRepo.deleteById(customerId);
        return "Customer removed successfully";
    } ;

    public List<CustomerEntity> getAllCustomer(){
        return customerRepo.findAll();
    }

    public CustomerEntity getCustomerById(String customerId) {
        return customerRepo.findById(customerId).get();
    };
}
