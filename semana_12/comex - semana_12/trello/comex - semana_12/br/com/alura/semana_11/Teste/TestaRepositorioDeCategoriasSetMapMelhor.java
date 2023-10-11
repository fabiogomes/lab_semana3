package br.com.alura.semana_11.Teste;

import br.com.alura.semana_11.Modelo.Categoria;
import br.com.alura.semana_11.Modelo.Cliente;
import br.com.alura.semana_11.Modelo.RepositorioDeCategoriasSetMapMelhor;

public class TestaRepositorioDeCategoriasSetMapMelhor {
    public static void main(String[] args) {
        Categoria livros = new Categoria();
        livros.setNome("Livros");

        Categoria moveis = new Categoria();
        moveis.setNome("Moveis");

        Categoria celulares = new Categoria();
        celulares.setNome("Celulares");

        Cliente c1 = new Cliente("David");
        Cliente c2 = new Cliente("Linalva");
        Cliente c3 = new Cliente("Sara");

        RepositorioDeCategoriasSetMapMelhor repositorio = new RepositorioDeCategoriasSetMapMelhor();

        repositorio.adicionarCliente(livros,c1);
        repositorio.adicionarCliente(moveis,c2);
        repositorio.adicionarCliente(celulares,c3);
        repositorio.adicionarCliente(celulares,c1);

        System.out.println(">> Mostra =============================");
        System.out.println(repositorio.buscaTodos());

        System.out.println(">> Mostra =============================");
        repositorio.mostra();



//        System.out.println(">> Mostra =============================");
//        repositorio.mostra();
//        System.out.println("------------------------------------------");
//
//        System.out.println(repositorio.getQuantidadeDeCategoriasArmazenadas());
//        System.out.println("------------------------------------------");
//
//        System.out.println(repositorio.buscaPorCategoria(livros));
//        System.out.println(livros.getNome());
//        System.out.println("------------------------------------------");



    }
}
