package br.com.alura.Teste;

import br.com.alura.Modelo.Categoria;
import br.com.alura.Modelo.RepositorioDeCategoriasSet;

import java.util.LinkedList;

public class TestaRepositorioDeCategoriasSet {
    public static void main(String[] args) {
        RepositorioDeCategoriasSet repositorio = new RepositorioDeCategoriasSet();

        Categoria livros = new Categoria();
        livros.setNome("Livros");

        Categoria moveis = new Categoria();
        moveis.setNome("Moveis");

        Categoria celulares = new Categoria();
        celulares.setNome("Celulares");

        repositorio.adicionar(livros);
        repositorio.adicionar(moveis);
        repositorio.adicionar(celulares);

        System.out.println(">> Mostra =============================");
        repositorio.mostra();
        System.out.println("------------------------------------------");

        System.out.println(repositorio.getQuantidadeDeCategoriasArmazenadas());
        System.out.println("------------------------------------------");

        System.out.println(repositorio.buscaPorCategoria(livros));
        System.out.println(livros.getNome());
        System.out.println("------------------------------------------");



    }
}
