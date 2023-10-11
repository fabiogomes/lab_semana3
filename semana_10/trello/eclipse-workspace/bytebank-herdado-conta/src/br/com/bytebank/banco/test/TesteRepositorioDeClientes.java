package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

//br.com.bytebank.banco.test.TesteContas 
public class TesteRepositorioDeClientes {

	//java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{
						
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Cliente c4 = new Cliente();

		c1.setNome("Teste1");
		c2.setNome("Teste2");
		c3.setNome("Teste3");
		c4.setNome("Teste4");

		RepositorioDeClientes repo = new RepositorioDeClientes();
		repo.AddCliente(c1);
		repo.AddCliente(c2);
		repo.AddCliente(c3);
		repo.AddCliente(c4);

		System.out.println("____________________");
		repo.ListaClientes();
		System.out.println("____________________");
		repo.ListaQuantidade();
		System.out.println("____________________");
		repo.BuscaCliente(3);
		System.out.println("____________________");
	}

}
