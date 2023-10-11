package br.com.alura.comex.repositorio;
import br.com.alura.comex.modelo.Produto;
import br.com.alura.comex.repositorio.RepositorioDeProdutos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RepositorioProdutoTest {
    @Test
    public void testListaNomesDoRepositorioCliente() {
        RepositorioDeProdutos repositorio = new RepositorioDeProdutos();

        Produto celular = new Produto();
        celular.setNome("Celular");

        Produto tv = new Produto();
        tv.setNome("Tv");

        repositorio.adicionar(celular);
        repositorio.adicionar(tv);

        List<String> nomes = repositorio.buscaListaNome();

        Assertions.assertEquals(2, nomes.size());
        Assertions.assertEquals("Tv", nomes.get(1));
    }
}
