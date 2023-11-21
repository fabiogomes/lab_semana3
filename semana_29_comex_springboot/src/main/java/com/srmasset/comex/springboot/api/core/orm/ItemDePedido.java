package com.srmasset.comex.springboot.api.core.orm;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "item_pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ItemDePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "preco_unitario", nullable = false, length = 50)
    private BigDecimal precoUnitario;
    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;
    @ManyToOne(fetch = FetchType.LAZY)
    private Produto produto;
    @ManyToOne(fetch = FetchType.LAZY)
    private Pedido pedido;
    @Column(name = "desconto")
    private BigDecimal desconto;
    @Column(name = "tipo_desconto", length = 50)
    private String tipodedesconto = "NENHUM";

    public ItemDePedido(Integer quantidade, Produto produto, Pedido pedido) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.pedido = pedido;
        this.desconto = BigDecimal.ZERO;
        this.tipodedesconto = "NENHUM";
        this.precoUnitario = produto.getPreco();
        if(quantidade > 10){
            tipodedesconto = "QUANTIDADE";
            desconto = BigDecimal.valueOf(0.1);
        }
    }
}
