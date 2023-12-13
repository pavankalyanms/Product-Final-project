package com.example.InventoryService.Inventoryservice.Service;

import com.example.InventoryService.Inventoryservice.Repository.InventoryRepository;
import com.example.InventoryService.Inventoryservice.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public void addInventory(Inventory inventory){
        inventoryRepository.save(inventory);
    }
    public boolean isProductInStock(Inventory inventory){
        return false;
    }

}
