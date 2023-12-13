package com.example.orderservice.orderservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name="order_list_items")
public class OrderListItems {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
private Integer id;
private String code;
private double price;
private Integer quantity;
}
