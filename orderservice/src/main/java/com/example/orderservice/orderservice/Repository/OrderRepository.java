package com.example.orderservice.orderservice.Repository;

import com.example.orderservice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
