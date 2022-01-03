package com.switchfully.webshop.controller.item;

import com.switchfully.webshop.controller.dto.ItemDto;
import com.switchfully.webshop.service.item.ItemService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

class ItemControllerTest {

    @Test
    void givenAnItemDto_whenCreatingAnItem_thenReturnCreatedItemDto(){
        ItemService itemService = Mockito.mock(ItemService.class);

        ItemDto itemDto = new ItemDto()
                .setId("1")
                .setName("Canyon")
                .setPrice(3399.99)
                .setAmount(5);

        Mockito.when(itemService.createItem(any(ItemDto.class))).thenReturn(itemDto);
        ItemController itemController = new ItemController(itemService);
        Assertions.assertEquals(itemDto, itemController.addItems(new ItemDto()));
    }
}