package dev.berlitz.demo.contract;

import dev.berlitz.demo.impl.ItemService;
import dev.berlitz.demo.impl.model.response.Item;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;
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
    public List<Item> getItems() {
        return service.getItems();
    }

    @PostMapping("/itens")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ExceptionHandler(ResponseStatusException.class)
    public void createItem(@RequestBody @NotNull Item item) {
        service.insertItem(item);
    }

    @DeleteMapping("/itens/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable(value = "id") Integer id) {
        service.deleteItem(id);
    }

}
