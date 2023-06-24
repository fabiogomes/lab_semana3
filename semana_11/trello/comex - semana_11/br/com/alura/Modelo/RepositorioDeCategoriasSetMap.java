package br.com.alura.Modelo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepositorioDeCategoriasSetMap {
    private Set<Categoria> categorias;
    private String chave;
    private Map<String, Categoria> cadastroCategoria;
    public RepositorioDeCategoriasSetMap() {

        this.categorias = new HashSet<>();
    }

    public void adicionar(Categoria categoria) {

        this.categorias.add(categoria);
        this.cadastroCategoria.put(categoria.getNome(), categoria);
    }

    public Map buscaTodos() {

        return this.cadastroCategoria;
    }

    public boolean buscaPorCategoria(Categoria categoria) {
        return this.cadastroCategoria.containsValue(categoria);
    }

    public int getQuantidadeDeCategoriasArmazenadas() {

        return this.cadastroCategoria.size();
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