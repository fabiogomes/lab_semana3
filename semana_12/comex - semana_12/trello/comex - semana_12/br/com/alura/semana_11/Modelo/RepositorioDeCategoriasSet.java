package br.com.alura.semana_11.Modelo;

import java.util.Set;
import java.util.HashSet;

public class RepositorioDeCategoriasSet {
    private Set<Categoria> categorias;
    public RepositorioDeCategoriasSet() {
        this.categorias = new HashSet<>();
    }

    public void adicionar(Categoria categoria) {

        this.categorias.add(categoria);
    }

    public Set<Categoria> buscaTodos() {
        return this.categorias;
    }

    public boolean buscaPorCategoria(Categoria categoria) {
        return this.categorias.contains(categoria);
    }

    public int getQuantidadeDeCategoriasArmazenadas() {
        return this.categorias.size();
    }

    public void mostra() {
        System.out.println(this.categorias);
    }

//    public void ordemCrescente() {
//        this.categorias.sort(new Comparator<Categoria>() {
//            @Override
//            public int compare(Categoria categoria1, Categoria categoria2) {
//                return categoria1.getNome().compareTo(categoria2.getNome());
//            }
//        });
//
//        this.mostra();
//    }
//
//    public void ordemDecrescente() {
//        this.categorias.sort(new Comparator<Categoria>() {
//            @Override
//            public int compare(Categoria categoria1, Categoria categoria2) {
//                return categoria2.getNome().compareTo(categoria1.getNome());
//            }
//        });
//
//        this.mostra();
//    }
}