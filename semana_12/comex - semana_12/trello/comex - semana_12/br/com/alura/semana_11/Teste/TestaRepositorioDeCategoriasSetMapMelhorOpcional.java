package br.com.alura.semana_11.Teste;

import java.util.List;
import java.util.ArrayList;
import br.com.alura.semana_11.Modelo.Categoria;
import br.com.alura.semana_11.Modelo.Cliente;
import br.com.alura.semana_11.Modelo.RepositorioDeCategoriasSetMapMelhorOpcional;

public class TestaRepositorioDeCategoriasSetMapMelhorOpcional {
    public static void main(String[] args) {
        Categoria livros = new Categoria();
        livros.setNome("Livros");

        Categoria moveis = new Categoria();
        moveis.setNome("Moveis");

        Cliente c1 = new Cliente("David");
        Cliente c2 = new Cliente("Linalva");
        Cliente c3 = new Cliente("Sara");
        Cliente c4 = new Cliente("Eliana");

        List<Cliente> lista1 = new ArrayList<>();
        List<Cliente> lista2 = new ArrayList<>();

        lista1.add(c1);
        lista1.add(c2);
        lista2.add(c3);
        lista2.add(c4);


        RepositorioDeCategoriasSetMapMelhorOpcional repositorio = new RepositorioDeCategoriasSetMapMelhorOpcional();

        System.out.println("");
        repositorio.adicionarListaCliente(livros, lista1);
        repositorio.adicionarListaCliente(moveis,lista2);

        System.out.println("");
        System.out.println(">> Mostra todas as categorias:                           =============================");
        System.out.println(repositorio.buscaTodos());

        System.out.println("");
        System.out.println(">> Mostra categorias e suas listas:                      =============================");
        repositorio.mostra();

        System.out.println("");
        System.out.println(">> Mostra lista de categorias com clientes e tamanho:    =============================");
        System.out.println(repositorio.getQuantidadeDeCategoriasArmazenadas());



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
