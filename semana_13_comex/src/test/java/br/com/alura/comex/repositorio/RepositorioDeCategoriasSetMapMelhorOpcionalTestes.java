package br.com.alura.comex.repositorio;

import br.com.alura.comex.modelo.Categoria;
import br.com.alura.comex.modelo.Cliente;
import br.com.alura.comex.repositorio.RepositorioDeCategoriasSetMapMelhorOpcional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class RepositorioDeCategoriasSetMapMelhorOpcionalTestes {

   @Test
   void ListagemDeCategoriasTeste() {
      Cliente david = new Cliente("David");
      Cliente sara = new Cliente("Sara");
      List<Cliente> clientes = new ArrayList<>();
      clientes.add(david);
      clientes.add(sara);

      Categoria livro = new Categoria();
      livro.setNome("Livro");

      RepositorioDeCategoriasSetMapMelhorOpcional repositorio = new RepositorioDeCategoriasSetMapMelhorOpcional();
      repositorio.adicionarListaCliente(livro, clientes);

      //repositorio.mostra();
      //System.out.println(repositorio.buscaTodos());

      RepositorioDeCategoriasSetMapMelhorOpcional teste = new RepositorioDeCategoriasSetMapMelhorOpcional();

      teste.adicionarListaCliente(livro, clientes);

      Assertions.assertEquals(teste.buscaTodos(), repositorio.buscaTodos());


      System.out.println(teste.buscaTodos());
      System.out.println(repositorio.buscaTodos());
      //System.out.println(repositorio.getQuantidadeDeCategoriasArmazenadas());
   }
}