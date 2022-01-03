package com.switchfully.webshop.controller.mapper;

import com.switchfully.webshop.domain.item.Item;
import com.switchfully.webshop.domain.item.ItemDto;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

    public Item mapToItem(ItemDto itemDto){
        return new Item(
                itemDto.getName(),
                itemDto.getPrice(),
                itemDto.getAmount()
        );
    }

    public ItemDto mapToItemDto(Item item){
        return new ItemDto()
                .setId(item.getId())
                .setName(item.getName())
                .setPrice(item.getPrice())
                .setAmount(item.getAmount());
    }
}
