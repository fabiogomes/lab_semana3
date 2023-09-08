package br.com.alura.Loja.Teste;

import br.com.alura.Loja.Modelo.Produto;

public class TestaIntegercomparaProdutos {
    public static void main(String[] args) {
            Produto camisa = new Produto("camisa");
            camisa.setDescricao("polo");
            camisa.setPreco(40.0);
            camisa.setQuantidade(2);

            Produto calca = new Produto("calca");
            calca.setDescricao("jeans");
            calca.setPreco(70.0);
            calca.setQuantidade(5);

            System.out.println(camisa.getNome());
            System.out.println(camisa.getDescricao());
            System.out.println(camisa.getPreco());
            System.out.println(camisa.getQuantidade());

            System.out.println(calca.getNome());
            System.out.println(calca.getDescricao());
            System.out.println(calca.getPreco());
            System.out.println(calca.getQuantidade());

            System.out.println(camisa);
            System.out.println(calca);

            if(camisa!=calca) {
                System.out.println("São objetos diferentes");
            }else{
                System.out.println("São objetos iguais");
            }
    }
}
