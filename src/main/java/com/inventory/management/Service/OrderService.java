package com.inventory.management.Service;

import com.inventory.management.DTO.OrderRequestDTO;
import com.inventory.management.Entity.ItemEntity;
import com.inventory.management.Entity.OrderEntity;
import com.inventory.management.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    public ItemService itemService;

    public String addOrder(OrderRequestDTO newOrderDTO){

        OrderEntity newOrder = OrderEntity.builder()
                .customer_Id(newOrderDTO.getCustomer_Id())
                .items(itemService.itemIdListToItemList(newOrderDTO.getItems()))
                .build();

        orderRepo.save(newOrder);
        return "Customer added successfully";
    }
    public List<OrderEntity> getAllOrders(){
        return  orderRepo.findAll();
    }


}
