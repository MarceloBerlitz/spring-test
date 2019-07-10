package dev.berlitz.demo.impl.model;

import lombok.*;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "ITENS")
public class ItemModel implements Serializable {
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
