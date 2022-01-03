package com.switchfully.webshop.service.item;


import com.switchfully.webshop.controller.dto.ItemDto;
import com.switchfully.webshop.domain.item.Item;

import java.util.List;

public interface ItemService {

    List<ItemDto> getAllAvailableItems();

    ItemDto createItem(ItemDto itemDto);

    ItemDto updateItem(String id, ItemDto itemDto);

    Item getItemById(String id);
}
