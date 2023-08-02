package br.com.alura.comex.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente implements Comparable<Cliente>{
    public String nome;

    private LocalDate dataCadastroCliente;

    private LocalDate dataNascimentoCliente;

    private String dataCadastroClienteFormatada;

    public Cliente(String nome){
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        this.dataCadastroCliente = LocalDate.now();
        //this.dataCadastroClienteFormatada = formatadorComHoras.format(this.dataCadastroCliente);

    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataCadastroCliente() {
        return dataCadastroCliente;
    }

    public String getDataCadastroClienteFormatada() {
        return this.dataCadastroClienteFormatada;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimentoCliente() {
        return dataNascimentoCliente;
    }

    public void setDataNascimentoCliente(LocalDate dataNascimentoCliente) {
        this.dataNascimentoCliente = dataNascimentoCliente;
    }

    @Override
    public int compareTo(Cliente cliente) {
        return this.getNome().compareTo(cliente.getNome());
    }

    @Override
    public boolean equals(Object cliente) {
        Cliente outroCliente = (Cliente) cliente;
        return this.nome.equals(outroCliente.nome);
    }

    @Override
    public int hashCode(){
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Data de cadastro cliente: " + this.dataCadastroCliente + ", Data de nascimento cliente: " + this.dataNascimentoCliente;
    }
}
