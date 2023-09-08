package br.com.bytebank.banco.modelo;

public class RepositorioDeCategorias {
    private Conta[] lista = new Conta[5];
    private int posicao = 0;

    public void AddCategoria(Conta conta){
        this.lista[posicao] = conta;
        this.posicao++;
    }

    public void ListaCategorias(){
        for(int i = 0; i < 5; i++){
            if(this.lista[i] != null) {
                Cliente exibe = this.lista[i].getTitular();
                System.out.println("Cliente Posicao: " + i + ": " + exibe);
            }
        }
    }

    public void BuscaCategoria(int posicao){
        System.out.println("Cliente posicao " + posicao + ": " + lista[posicao - 1].getTitular());
    }

    public void ListaQuantidade(){
        int quantidade = 0;
        for(int i = 0; i < 5; i++){
            if(this.lista[i] != null) {
                quantidade++;
            }
        }
        System.out.println("Quantidade de Categorias: " + quantidade);
    }

}
