package dev.berlitz.demo.contract.mapper;

import dev.berlitz.demo.contract.request.ItemRequest;
import dev.berlitz.demo.impl.model.ItemModel;

public class ItemModelMapper {
    public static ItemModel mapFrom(ItemRequest itemRequest) {
        return ItemModel.builder()
                .codigo(itemRequest.getCodigo())
                .descricao(itemRequest.getDescricao())
                .estoque(itemRequest.getEstoque())
                .precoBruto(itemRequest.getPrecoBruto())
                .id(itemRequest.getId())
                .precoLiquido(itemRequest.getPrecoLiquido())
                .build();
    }
}
