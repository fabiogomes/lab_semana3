package br.com.bytebank.banco.modelo;

import java.util.LinkedList;
import java.util.List;

public class RepositorioDeCategoriasArrayList {
    private List<Conta> lista;
    private int posicao;

    public RepositorioDeCategoriasArrayList(){
        lista = new LinkedList<>();
        posicao = 0;
    }

    public void AddCategoria(Conta conta){
        this.lista.add(conta);
    }

    public void ListaCategorias(){
        for(int i = 0; i < 5; i++){
            if(this.lista.get(i) != null) {
                Cliente exibe = this.lista.get(i).getTitular();
                System.out.println("Cliente Posicao: " + i + ": " + exibe);
            }
        }
    }

    public void BuscaCategoria(int posicao){
        System.out.println("Cliente posicao " + posicao + ": " + this.lista.get(posicao - 1).getTitular());
    }

    public void ListaQuantidade(){
        System.out.println("Quantidade de Categorias: " + lista.size());
    }
}
