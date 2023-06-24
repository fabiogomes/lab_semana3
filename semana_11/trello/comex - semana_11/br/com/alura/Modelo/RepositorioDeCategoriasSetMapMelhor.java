package br.com.alura.Modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepositorioDeCategoriasSetMapMelhor {
    private Set<Categoria> categorias;
    private Map<Categoria, Cliente> cadastroCategoria;

    public RepositorioDeCategoriasSetMapMelhor() {
        this.categorias = new HashSet<>();
        this.cadastroCategoria = new HashMap<>();
    }

    public void adicionarCliente(Categoria categoria, Cliente cliente) {
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

        return this.cadastroCategoria.size();
    }

    public void mostra() {
        System.out.println(this.cadastroCategoria);
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