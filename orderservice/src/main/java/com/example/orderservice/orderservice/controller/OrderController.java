package com.example.orderservice.orderservice.controller;

import com.example.orderservice.orderservice.dto.OrderRequest;
import com.example.orderservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/orderservice")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/neworder")
    public String takeOrder(@RequestBody OrderRequest orderRequest)
    {
        orderService.addOrder(orderRequest);
        return "placed";
    }

}
