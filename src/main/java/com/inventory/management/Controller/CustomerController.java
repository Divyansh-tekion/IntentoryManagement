package com.inventory.management.Controller;

import com.inventory.management.Entity.CustomerEntity;
import com.inventory.management.Service.BrandService;
import com.inventory.management.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
@Autowired
    private CustomerService customerService;

@PostMapping("/addcustomer")
    public String addCustomer(@RequestBody CustomerEntity newCustomer){
    return customerService.addCustomer(newCustomer);
    }

    @DeleteMapping("/deletecustomer/{customerId}")
    public String deleteCustomer(@PathVariable String customerId){
     return customerService.deleteCustomer(customerId);
    }

    @GetMapping("/allcustomer")
    public List<CustomerEntity> getAllCustomer(){
    return customerService.getAllCustomer();
    };

    @GetMapping("/byid/{customerId}")
    public CustomerEntity getCustomerById(@PathVariable String customerId){
      return customerService.getCustomerById(customerId);
    };
}
