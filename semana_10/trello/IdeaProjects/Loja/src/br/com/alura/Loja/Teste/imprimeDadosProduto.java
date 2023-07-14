package br.com.alura.Loja.Teste;
import br.com.alura.Loja.Modelo.*;

public class imprimeDadosProduto {
    public static void main(String[] args) {
        Produto calca = new Produto("calca");
        calca.setDescricao("jeans");
        calca.setPreco(70.0);
        calca.setQuantidade(5);

        calca.exibeDadosProduto();
    }
}
