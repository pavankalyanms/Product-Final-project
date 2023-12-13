package com.example.InventoryService.Inventoryservice.Repository;

import com.example.InventoryService.Inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Integer> {
}
