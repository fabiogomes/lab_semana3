package br.com.alura.Modelo;

import java.util.HashMap;
import java.util.Map;


public class Cliente implements Comparable<Cliente>{
    public String nome;

    public Cliente(String nome){
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return this.nome;
    }
}
