package dev.berlitz.demo.contract.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemRequest {
    private Integer id;
    @NotNull
    private Integer codigo;
    @NotNull
    private Integer estoque;
    @NotNull
    private String descricao;
    @NotNull
    private BigDecimal precoBruto;
    @NotNull
    private BigDecimal precoLiquido;
}
