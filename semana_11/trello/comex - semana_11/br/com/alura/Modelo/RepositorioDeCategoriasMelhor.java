package br.com.alura.Modelo;

import java.util.Comparator;
import java.util.LinkedList;

public class RepositorioDeCategoriasMelhor {
    private LinkedList<Categoria> categorias;
    private int posicao;

    public RepositorioDeCategoriasMelhor() {
        this.categorias = new LinkedList<Categoria>();
    }

    public void adicionar(Categoria categoria) {
        this.categorias.add(categoria);
    }

    public LinkedList<Categoria> buscaTodos() {
        return this.categorias;
    }

    public Categoria buscaPorPosicao(int posicao) {
        return this.categorias.get(posicao);
    }

    public int getQuantidadeDeCategoriasArmazenados() {
        return this.categorias.size();
    }

    public void mostra() {
        for (int i = 0; i < this.categorias.size(); i++) {
            System.out.println("Nome: " + this.categorias.get(i).getNome());
        }
    }

    public void ordemCrescente() {
        this.categorias.sort(new Comparator<Categoria>() {
            @Override
            public int compare(Categoria categoria1, Categoria categoria2) {
                return categoria1.getNome().compareTo(categoria2.getNome());
            }
        });

        this.mostra();
    }

    public void ordemDecrescente() {
        this.categorias.sort(new Comparator<Categoria>() {
            @Override
            public int compare(Categoria categoria1, Categoria categoria2) {
                return categoria2.getNome().compareTo(categoria1.getNome());
            }
        });

        this.mostra();
    }
}