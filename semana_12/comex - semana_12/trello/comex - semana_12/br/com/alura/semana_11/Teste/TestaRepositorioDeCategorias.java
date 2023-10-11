package br.com.alura.semana_11.Teste;

import br.com.alura.semana_11.Modelo.Categoria;
import br.com.alura.semana_11.Modelo.RepositorioDeCategorias;

public class TestaRepositorioDeCategorias {
    public static void main(String[] args) {
        RepositorioDeCategorias repositorio = new RepositorioDeCategorias();

        Categoria celulares = new Categoria();
        celulares.setNome("Celulares");

        Categoria livros = new Categoria();
        livros.setNome("Livros");

        repositorio.adicionar(celulares);
        repositorio.adicionar(livros);

        repositorio.mostra();

        System.out.println("Quantidade: " + repositorio.getQuantidadeDeCategoriasArmazenados());
    }

}
