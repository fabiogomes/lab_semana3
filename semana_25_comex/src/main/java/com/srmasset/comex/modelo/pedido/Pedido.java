package com.srmasset.comex.modelo.pedido;

import com.srmasset.comex.modelo.cliente.Cliente;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PEDIDO")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "DATACADASTRO", nullable = false)
    private LocalDate DATACADASTRO = LocalDate.now();
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente CLIENTE;
    @OneToMany(mappedBy = "PEDIDO", cascade = CascadeType.ALL)
    private List<ItemDePedido> ITENS = new ArrayList<>();
    @Column(name = "DESCONTO", nullable = false)
    private BigDecimal DESCONTO;
    @Column(name = "TIPODEDESCONTO", nullable = false)
    private Boolean TIPODEDESCONTO; //1 = fidelidade, 0 = nenhum
    @Column(name = "VALORTOTAL")
    private BigDecimal VALORTOTAL = BigDecimal.ZERO;

    public Pedido() {
    }

    public Pedido(Cliente CLIENTE, BigDecimal DESCONTO, Boolean TIPODEDESCONTO) {
        this.CLIENTE = CLIENTE;
        this.DESCONTO = DESCONTO;
        this.TIPODEDESCONTO = TIPODEDESCONTO;
    }

    public void adicionarItem(ItemDePedido item){
        item.setPEDIDO(this);
        ITENS.add(item);

        BigDecimal valor = item.getPRECOUNITARIO().multiply(BigDecimal.valueOf(item.getQUANTIDADE()));
        //BigDecimal qtd = BigDecimal.valueOf(item.getQUANTIDADE());
        this.VALORTOTAL = VALORTOTAL.add(valor);
        //this.VALORTOTAL = VALORTOTAL.multiply(qtd);
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDATACADASTRO() {
        return DATACADASTRO;
    }

    public Cliente getCLIENTE() {
        return CLIENTE;
    }

    public List<ItemDePedido> getITENS() {
        return ITENS;
    }

    public BigDecimal getDESCONTO() {
        return DESCONTO;
    }

    public Boolean getTIPODEDESCONTO() {
        return TIPODEDESCONTO;
    }

    public void setITENS(List<ItemDePedido> ITENS) {
        this.ITENS = ITENS;
    }

    public void setDESCONTO(BigDecimal DESCONTO) {
        this.DESCONTO = DESCONTO;
    }

    public void setTIPODEDESCONTO(Boolean TIPODEDESCONTO) {
        this.TIPODEDESCONTO = TIPODEDESCONTO;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", DATACADASTRO=" + DATACADASTRO +
                ", CLIENTE=" + CLIENTE +
                ", ITENS=" + ITENS +
                '}';
    }
}