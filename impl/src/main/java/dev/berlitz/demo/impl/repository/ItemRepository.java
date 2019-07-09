package dev.berlitz.demo.impl.repository;

import dev.berlitz.demo.impl.model.response.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

}