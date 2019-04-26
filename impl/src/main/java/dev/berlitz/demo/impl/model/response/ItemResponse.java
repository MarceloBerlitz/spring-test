package dev.berlitz.demo.impl.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemResponse implements Serializable {

    private Integer codigo;
    private Integer estoque;
    private Integer estoqueCd;
    private String nome;
    private BigDecimal precoDe;
    private BigDecimal precoPor;
    private BigDecimal precoFidelidade55Mais;
    private BigDecimal precoFidelidade;
    private BigDecimal percentualDesconto;
    private BigDecimal valorDesconto;
    private Boolean possuiItemAVencer;
    private Boolean participaPbm;
    private Boolean permiteAdesao;
    private Boolean possuiKitAdesao;
    private Boolean exclusivoPanvel;
    private Boolean participaListaReferencial;
    private Boolean participaFarmaciaPopular;
}
