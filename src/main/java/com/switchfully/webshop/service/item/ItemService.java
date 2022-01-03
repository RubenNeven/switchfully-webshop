package com.switchfully.webshop.service.item;


import com.switchfully.webshop.domain.item.ItemDto;
import java.util.List;

public interface ItemService {

    List<ItemDto> getAllAvailableItems();

    ItemDto createItem(ItemDto itemDto);
}
