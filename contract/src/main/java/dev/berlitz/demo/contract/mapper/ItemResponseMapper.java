package dev.berlitz.demo.contract.mapper;

import dev.berlitz.demo.contract.response.ItemResponse;
import dev.berlitz.demo.impl.model.ItemModel;

public class ItemResponseMapper {
    public static ItemResponse mapFrom(ItemModel itemModel) {
        return ItemResponse.builder()
                .codigo(itemModel.getCodigo())
                .descricao(itemModel.getDescricao())
                .estoque(itemModel.getEstoque())
                .id(itemModel.getId())
                .precoBruto(itemModel.getPrecoBruto())
                .precoLiquido(itemModel.getPrecoLiquido())
                .build();
    }
}
