package dev.berlitz.demo.impl;

import dev.berlitz.demo.impl.repository.ItemRepository;
import oracle.jdbc.driver.DatabaseError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import dev.berlitz.demo.impl.model.response.Item;
import org.springframework.web.client.HttpClientErrorException;

import javax.persistence.Id;
import java.sql.SQLException;
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

    public void insertItem(Item item) {
        repository.save(item);
    }

    public void deleteItem(Integer id) {
        repository.deleteById(id);
    }

}
