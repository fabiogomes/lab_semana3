package br.com.alura.comex.repositorio;

import br.com.alura.comex.modelo.Categoria;

import java.util.*;

public class RepositorioDeCategoriasSetMapMelhorOpcional {
    private List<Categoria> categorias;
    private Map<Categoria, List> cadastroCategoria;

    public RepositorioDeCategoriasSetMapMelhorOpcional() {
        this.categorias = new ArrayList<>();
        this.cadastroCategoria = new HashMap<>();
    }

    public void adicionarListaCliente(Categoria categoria, List cliente) {
        this.categorias.add(categoria);
        this.cadastroCategoria.put(categoria, cliente);
    }

    public Set buscaTodos() {
        return this.cadastroCategoria.keySet();
    }

    public boolean buscaPorCategoria(Categoria categoria) {
        return this.cadastroCategoria.containsValue(categoria);
    }

    public int getQuantidadeDeCategoriasArmazenadas() {
        System.out.println(this.cadastroCategoria);
        return this.cadastroCategoria.size();
    }

    public void mostra() {
        System.out.println(this.cadastroCategoria);
    }

//    public void ordemCrescente() {
//        this.categorias.sort(new Comparator<br.com.alura.comex.modelo.Categoria>() {
//            @Override
//            public int compare(br.com.alura.comex.modelo.Categoria categoria1, br.com.alura.comex.modelo.Categoria categoria2) {
//                return categoria1.getNome().compareTo(categoria2.getNome());
//            }
//        });
//
//        this.mostra();
//    }
//
//    public void ordemDecrescente() {
//        this.categorias.sort(new Comparator<br.com.alura.comex.modelo.Categoria>() {
//            @Override
//            public int compare(br.com.alura.comex.modelo.Categoria categoria1, br.com.alura.comex.modelo.Categoria categoria2) {
//                return categoria2.getNome().compareTo(categoria1.getNome());
//            }
//        });
//
//        this.mostra();
//    }
}