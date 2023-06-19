package br.com.alura.Loja.Modelo;

public class Produto {
    private static int itensTotal;
    private String nome;
    private String descricao;
    private double preco;
    private Integer quantidade;

    public Produto(String nome){
        Produto.itensTotal++;
        this.nome = nome;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade.intValue();
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade.valueOf(quantidade);
    }

    public static int getTotalItens(){
        return Produto.itensTotal;
    }

    public void exibeDadosProduto(){
        System.out.println(">> Dados do produto");
        System.out.println("::Nome: " + this.nome);
        System.out.println("::Descrição: " + this.descricao);
    }
}
