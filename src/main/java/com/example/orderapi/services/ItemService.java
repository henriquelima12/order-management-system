package com.example.orderapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderapi.entities.Item;
import com.example.orderapi.repositories.ItemRepository;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public Item saveItem(Item Item) {
        return itemRepository.save(Item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }

}
