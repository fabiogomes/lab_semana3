package com.srmasset.comex.springdata.orm;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente{
    @Id
    private String cpf;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "telefone", nullable = false, length = 18)
    private String telefone;
    @Embedded
    private Endereco endereco;

    public Cliente(){}

    public Cliente(String cpf, String nome, String telefone, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
