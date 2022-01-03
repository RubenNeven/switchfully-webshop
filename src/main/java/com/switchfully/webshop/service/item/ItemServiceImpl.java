package com.switchfully.webshop.service.item;

import com.switchfully.webshop.controller.mapper.ItemMapper;
import com.switchfully.webshop.domain.item.Item;
import com.switchfully.webshop.domain.item.ItemDto;
import com.switchfully.webshop.repository.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
    }

    @Override
    public List<ItemDto> getAllAvailableItems() {
        return itemRepository.findAll().stream()
                .map(itemMapper::mapToItemDto)
                .collect(Collectors.toList());
    }

    @Override
    public ItemDto createItem(ItemDto itemDto) {
        Item item = itemMapper.mapToItem(itemDto);
        itemRepository.save(item);
        return itemMapper.mapToItemDto(item);
    }
}
