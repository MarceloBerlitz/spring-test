package dev.berlitz.demo.contract.mapper;

import dev.berlitz.demo.contract.response.ItemListResponse;
import dev.berlitz.demo.impl.model.ItemModel;

public class ItemListResponseMapper {
    public static ItemListResponse mapFrom(ItemModel itemModel) {
        return ItemListResponse.builder()
                .descricao(itemModel.getDescricao())
                .id(itemModel.getId())
                .build();
    }
}
