package com.switchfully.webshop.service.item;

import com.switchfully.webshop.controller.dto.ItemDto;
import com.switchfully.webshop.controller.mapper.ItemMapper;
import com.switchfully.webshop.domain.item.Item;
import com.switchfully.webshop.exception.InvalidItemException;
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


    @Override
    public ItemDto updateItem(String id, ItemDto itemDto) {
        Item itemById = getItemById(id);
        itemById.setName(itemDto.getName());
        itemById.setAmount(itemDto.getAmount());
        itemById.setPrice(itemDto.getPrice());
        Item updatedItem = itemRepository.save(itemById);
        return itemMapper.mapToItemDto(updatedItem);
    }

    @Override
    public Item getItemById(String id) {
        return itemRepository.findAll()
                .stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new InvalidItemException("Item with id:" + id + " does not exists!"));
    }
}
