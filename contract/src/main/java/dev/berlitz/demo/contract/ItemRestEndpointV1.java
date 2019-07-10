package dev.berlitz.demo.contract;

import dev.berlitz.demo.impl.ItemService;
import dev.berlitz.demo.impl.model.response.ItemModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

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
    public List<ItemModel> getItems() {
        return service.getItems();
    }

    @PostMapping("/itens")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void createItem(@RequestBody @NotNull ItemModel item) {
        service.insertItem(item);
    }

    @DeleteMapping("/itens/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable(value = "id") Integer id) {
        service.deleteItem(id);
    }

    @PutMapping("/itens")
    @ResponseStatus(HttpStatus.OK)
    public ItemModel editItem(@RequestBody @NotNull ItemModel item) {
        return service.insertItem(item);
    }

}
