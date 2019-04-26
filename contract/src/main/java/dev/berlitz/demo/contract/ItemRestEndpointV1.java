package dev.berlitz.demo.contract;

import dev.berlitz.demo.impl.ItemService;
import dev.berlitz.demo.impl.model.response.ItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemRestEndpointV1 {

    @Autowired
    ItemService service;

    @CrossOrigin(origins = "*")
    @GetMapping("/item-busca")
    public ItemResponse getItemResponse(
            @Nullable
            @RequestParam Integer filial,
            @Nullable
            @RequestParam String ordenarPor,
            @Nullable
            @RequestParam String textoBusca,
            @Nullable
            @RequestParam String tipoBusca
    ) {
        return service.buscarItem(filial, ordenarPor, textoBusca, tipoBusca);
    }

}
