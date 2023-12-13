package com.example.orderservice.orderservice.dto;

import com.example.orderservice.orderservice.model.OrderListItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderListItemsDto> orderListItemsDtos;

}
