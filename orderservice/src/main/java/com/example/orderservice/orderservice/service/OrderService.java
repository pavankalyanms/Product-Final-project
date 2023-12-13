package com.example.orderservice.orderservice.service;

import com.example.orderservice.orderservice.Repository.OrderRepository;
import com.example.orderservice.orderservice.dto.OrderListItemsDto;
import com.example.orderservice.orderservice.dto.OrderRequest;
import com.example.orderservice.orderservice.model.Order;
import com.example.orderservice.orderservice.model.OrderListItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public void addOrder(OrderRequest orderRequest){
        Order order=new Order();
        order.setOrdernumber(UUID.randomUUID().toString());
        List<OrderListItems> orderListItemsList=orderRequest.getOrderListItemsDtos()
                .stream()
                .map(this::mapToDto)
                .toList();
        order.setOrderitems(orderListItemsList);
        orderRepository.save(order);
    }

    private OrderListItems mapToDto(OrderListItemsDto orderListItemsDto) {
        OrderListItems orderListItems=new OrderListItems();
        orderListItems.setCode(orderListItemsDto.getOlid());
        orderListItems.setPrice(orderListItemsDto.getOprice());
        orderListItems.setQuantity(orderListItemsDto.getQuantity());
        return orderListItems;
    }


}
