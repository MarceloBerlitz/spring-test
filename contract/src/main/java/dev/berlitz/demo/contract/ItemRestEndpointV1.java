package dev.berlitz.demo.contract;

import dev.berlitz.demo.impl.ItemService;
import dev.berlitz.demo.impl.model.response.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item/v1")
public class ItemRestEndpointV1 {

    private final ItemService service;

    public ItemRestEndpointV1(ItemService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/itens")
    public List<Item> getItems() {
        return service.getItems();
    }

}
