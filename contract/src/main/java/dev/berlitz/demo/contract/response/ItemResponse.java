package dev.berlitz.demo.contract.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemResponse {
    private Integer id;
    private Integer codigo;
    private Integer estoque;
    private String descricao;
    private BigDecimal precoBruto;
    private BigDecimal precoLiquido;
}
