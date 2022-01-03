package com.switchfully.webshop.controller.item;

import com.switchfully.webshop.controller.dto.ItemDto;
import com.switchfully.webshop.service.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @PreAuthorize("hasAuthority('GET_ALL_ITEMS')")
    public List<ItemDto> getAllAvailableItems(){
        return itemService.getAllAvailableItems();
    }

    @PostMapping(produces = "application/json", consumes = "application/json")
    public ItemDto addItems(@RequestBody ItemDto itemDto){
        return itemService.createItem(itemDto);
    }

    @PutMapping(path = "/{id}", produces = "application/json", consumes = "application/json")
    @PreAuthorize("hasAuthority('UPDATE_ITEM')")
    public ItemDto updateItem(@PathVariable String id, @RequestBody ItemDto itemDto){
        return itemService.updateItem(id, itemDto);
    }
}
