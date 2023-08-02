package br.com.alura.comex.modelo;

import br.com.alura.comex.modelo.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class ClienteTestes {

    @Test
    void DeveriaRetornarDataCadastroCliente(){
        Cliente testeData = new Cliente("David");
        System.out.println("Data do cliente: " + testeData.getDataCadastroCliente());
        System.out.println("Data esperada: " + LocalDate.now());
        assertEquals(LocalDate.now(), testeData.getDataCadastroCliente());
    }
}
