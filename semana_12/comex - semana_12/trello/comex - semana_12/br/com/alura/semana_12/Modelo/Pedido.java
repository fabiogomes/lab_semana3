package br.com.alura.semana_12.Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido {
    private LocalDate dataCadastroPedido;
    private Cliente cliente;
    private Integer quantidade;

    public Pedido(){
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        this.dataCadastroPedido = LocalDate.now();
        //this.dataCadastroClienteFormatada = formatadorComHoras.format(this.dataCadastroCliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataCadastroPedido(){
        return this.dataCadastroPedido;
    }

    @Override
    public String toString() {
        return "Pedido: " + this.cliente + ", quantidade=" + this.quantidade + ", Data de cadastro do pedido: " + this.dataCadastroPedido;
    }
}
