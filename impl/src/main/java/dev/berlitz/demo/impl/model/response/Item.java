package dev.berlitz.demo.impl.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Item implements Serializable {
    @Id
    private Integer id;
    private Integer codigo;
    private Integer estoque;
    private String descricao;
    @Column(name = "PRECO_BRUTO")
    private BigDecimal precoBruto;
    @Column(name = "PRECO_LIQUIDO")
    private BigDecimal precoLiquido;
}
