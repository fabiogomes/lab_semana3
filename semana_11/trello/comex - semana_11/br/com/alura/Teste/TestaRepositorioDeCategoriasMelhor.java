package br.com.alura.Teste;

import br.com.alura.Modelo.Categoria;
import br.com.alura.Modelo.RepositorioDeCategoriasMelhor;

import java.util.LinkedList;

public class TestaRepositorioDeCategoriasMelhor {
    public static void main(String[] args) {
        RepositorioDeCategoriasMelhor repositorio = new RepositorioDeCategoriasMelhor();

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

        LinkedList<Categoria> categorias =
                repositorio.buscaTodos();

        System.out.println(">> Usando for  =============================");

        for (Categoria categoria: categorias) {
            System.out.println("Nome: " + categoria.getNome());
        }

        System.out.println(">> Ordenação crescente =============================");

        repositorio.ordemCrescente();

        System.out.println(">> Ordenação Decrescente =============================");

        repositorio.ordemDecrescente();
    }
}
