package dev.berlitz.demo.impl;

import dev.berlitz.demo.impl.repository.ItemRepository;
import org.springframework.stereotype.Service;

import dev.berlitz.demo.impl.model.response.Item;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> getItems() {
        List<Item> list = new ArrayList<>();
        repository.findAll()
                .iterator()
                .forEachRemaining(list::add);
        return list;
    }

}
