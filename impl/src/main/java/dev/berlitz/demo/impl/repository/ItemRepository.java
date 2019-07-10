package dev.berlitz.demo.impl.repository;

import dev.berlitz.demo.impl.model.ItemModel;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemModel, Integer> {
}