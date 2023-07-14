package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Cliente;

public class TestaUpperCase {
    public static void main(String[] args) {
        Cliente david = new Cliente();
        david.setNome("David Edson da Cruz");

        String nomeMaisculo = david.getNomeEmMaiusculo();
        System.out.println(nomeMaisculo);
    }
}
