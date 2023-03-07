package com.inventory.management.Controller;

import com.inventory.management.DTO.OrderRequestDTO;
import com.inventory.management.Entity.ItemEntity;
import com.inventory.management.Entity.OrderEntity;
import com.inventory.management.Service.ItemService;
import com.inventory.management.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @GetMapping("/getall")
    public List<OrderEntity> getAllOrders(){
        return orderService.getAllOrders();
    }
    @PostMapping("/create")
    public String createOrder(@RequestBody OrderRequestDTO newOrder){
    orderService.addOrder(newOrder);
    return "Order Created";
}





}
