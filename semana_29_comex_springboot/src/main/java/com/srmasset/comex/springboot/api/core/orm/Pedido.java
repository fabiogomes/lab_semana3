package com.srmasset.comex.springboot.api.core.orm;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedido")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "datacadastro", nullable = false)
    private LocalDate datacadastro = LocalDate.now();
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemDePedido> itens = new ArrayList<>();
    @Column(name = "desconto", nullable = true)
    private BigDecimal desconto = BigDecimal.ZERO;
    @Column(name = "tipo_desconto", nullable = true)
    private String tipoDeDesconto = "";
    @Column(name = "valortotal")
    private BigDecimal valorTotal = BigDecimal.ZERO;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void aplicaDescontoFidelidade() {
        this.tipoDeDesconto += "FIDELIDADE ";
        this.desconto = this.desconto.add(BigDecimal.valueOf(0.05));
    }

    public void adicionarItem(ItemDePedido item){
        item.setPedido(this);
        itens.add(item);

        if(item.getQuantidade() > 10) {
            this.tipoDeDesconto = this.tipoDeDesconto + "QUANTIDADE";
            this.desconto = this.desconto.add(BigDecimal.valueOf(0.1));

            BigDecimal valor = item.getPrecoUnitario().multiply(BigDecimal.valueOf(item.getQuantidade()));
            this.valorTotal = valorTotal.add(valor);
            this.valorTotal = valorTotal.subtract(valor.multiply(this.desconto));
        }else {
            BigDecimal valor = item.getPrecoUnitario().multiply(BigDecimal.valueOf(item.getQuantidade()));
            this.valorTotal = valorTotal.add(valor);
            this.valorTotal = valorTotal.subtract(valor.multiply(this.desconto));
        }
    }
}