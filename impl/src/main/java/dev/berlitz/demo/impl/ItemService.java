package dev.berlitz.demo.impl;

import org.springframework.stereotype.Service;

import dev.berlitz.demo.impl.model.response.ItemResponse;

import java.math.BigDecimal;

@Service
public class ItemService {

    public ItemResponse buscarItem(Integer filial, String ordenarPor, String textoBusca, String tipoBusca) {
        return ItemResponse.builder()
                .codigo(844460)
                .estoque(-21)
                .estoqueCd(0)
                .percentualDesconto(BigDecimal.ZERO)
                .possuiItemAVencer(null)
                .precoDe(new BigDecimal(82.64))
                .precoFidelidade(new BigDecimal(82.64))
                .precoFidelidade55Mais(new BigDecimal(82.64))
                .precoPor(new BigDecimal(82.64))
                .valorDesconto(BigDecimal.ZERO)
                .build();
    }

}
