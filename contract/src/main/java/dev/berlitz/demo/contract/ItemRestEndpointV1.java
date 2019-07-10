package dev.berlitz.demo.contract;

import dev.berlitz.demo.contract.mapper.ItemListResponseMapper;
import dev.berlitz.demo.contract.mapper.ItemModelMapper;
import dev.berlitz.demo.contract.mapper.ItemResponseMapper;
import dev.berlitz.demo.contract.request.ItemRequest;
import dev.berlitz.demo.contract.response.ItemListResponse;
import dev.berlitz.demo.contract.response.ItemResponse;
import dev.berlitz.demo.impl.ItemService;
import dev.berlitz.demo.impl.model.ItemModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/item/v1")
public class ItemRestEndpointV1 {

    private final ItemService service;

    public ItemRestEndpointV1(ItemService service) {
        this.service = service;
    }

    @GetMapping("/itens")
    @ResponseStatus(HttpStatus.OK)
    public List<ItemListResponse> getItems() {
        return service.getItems()
                .stream()
                .map(ItemListResponseMapper::mapFrom)
                .collect(Collectors.toList());
    }

    @GetMapping("/itens/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ItemResponse getItem(@PathVariable(name = "id") Integer id) {
        return ItemResponseMapper.mapFrom(service.getItem(id));
    }

    @PostMapping("/itens")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createItem(
            @NotNull
            @Valid
            @RequestBody ItemRequest item) {
        service.insertItem(ItemModelMapper.mapFrom(item));
    }

    @DeleteMapping("/itens/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable(value = "id") Integer id) {
        service.deleteItem(id);
    }

    @PutMapping("/itens")
    @ResponseStatus(HttpStatus.OK)
    public ItemModel editItem(
            @NotNull
            @Valid
            @RequestBody ItemRequest item) {
        return service.insertItem(ItemModelMapper.mapFrom(item));
    }

}
