package com.srmasset.comex.springdata.orm;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedido")
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
    private Boolean tipoDeDesconto; //1 = fidelidade, 0 = nenhum
    @Column(name = "valortotal")
    private BigDecimal valorTotal = BigDecimal.ZERO;

    public Pedido() {
    }

    public Pedido(Cliente cliente, BigDecimal desconto, Boolean tipoDeDesconto) {
        this.cliente = cliente;
        this.desconto = desconto;
        this.tipoDeDesconto = tipoDeDesconto;
    }

    public void adicionarItem(ItemDePedido item){
        item.setPedido(this);
        itens.add(item);

        BigDecimal valor = item.getPrecoUnitario().multiply(BigDecimal.valueOf(item.getQuantidade()));
        //BigDecimal qtd = BigDecimal.valueOf(item.getQUANTIDADE());
        this.valorTotal = valorTotal.add(valor);
        //this.VALORTOTAL = VALORTOTAL.multiply(qtd);
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDatacadastro() {
        return datacadastro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemDePedido> getItens() {
        return itens;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public Boolean getTipoDeDesconto() {
        return tipoDeDesconto;
    }

    public BigDecimal getValortotal() {
        return valorTotal;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public void setTipoDeDesconto(Boolean tipoDeDesconto) {
        this.tipoDeDesconto = tipoDeDesconto;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", datacadastro=" + datacadastro +
                ", cliente=" + cliente +
                ", itens=" + itens +
                ", desconto=" + desconto +
                ", tipoDeDesconto=" + tipoDeDesconto +
                ", valortotal=" + valorTotal +
                '}';
    }
}