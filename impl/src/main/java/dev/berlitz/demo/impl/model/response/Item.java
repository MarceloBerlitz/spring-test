package dev.berlitz.demo.impl.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ITEM_SEQ")
    @SequenceGenerator(sequenceName = "ITENS_SEQUENCE", allocationSize = 1, name = "ITEM_SEQ")
    private Integer id;
    private Integer codigo;
    private Integer estoque;
    private String descricao;
    @Column(name = "PRECO_BRUTO")
    private BigDecimal precoBruto;
    @Column(name = "PRECO_LIQUIDO")
    private BigDecimal precoLiquido;
}
