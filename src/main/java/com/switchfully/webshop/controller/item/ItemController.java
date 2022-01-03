package com.switchfully.webshop.controller.item;

import com.switchfully.webshop.domain.item.ItemDto;
import com.switchfully.webshop.service.item.ItemService;
import com.switchfully.webshop.service.item.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping(produces = "application/json")
    public List<ItemDto> getAllAvailableItems(){
        return itemService.getAllAvailableItems();
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ItemDto addItems(@RequestBody ItemDto itemDto){
        return itemService.createItem(itemDto);
    }
}
