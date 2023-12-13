package com.example.orderservice.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderListItemsDto {
    private String olid;
    private Integer oprice;
    private Integer quantity;

}
