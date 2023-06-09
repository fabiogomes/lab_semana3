package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Cliente;

public class TestaDadosCliente_tostring {
    public static void main(String[] args) {
        Cliente david = new Cliente();
        david.setNome("David Edson da Cruz");
        david.setData("09/06/2023");
        david.setEmail("david@gmail.com");

        String nomeMaisculo = david.getNomeEmMaiusculo();
        System.out.println(nomeMaisculo);

        System.out.println(david);
        System.out.println(david.toString());
    }
}
