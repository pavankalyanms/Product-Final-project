package com.example.InventoryService.Inventoryservice.Controller;

import com.example.InventoryService.Inventoryservice.Service.InventoryService;
import com.example.InventoryService.Inventoryservice.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;
    @GetMapping("/status")
    public String inventorystatus(Inventory inventory){
        inventoryService.isProductInStock(inventory);
        return "data is fetched";
    }


}
