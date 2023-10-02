package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.*;

//br.com.bytebank.banco.test.TesteContas 
public class TesteRepositorioDeCategoriasLinkedList {

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

		ContaPoupanca cp1 = new ContaPoupanca(11,11);
		ContaPoupanca cp2 = new ContaPoupanca(22,22);
		ContaCorrente cc3 = new ContaCorrente(33,33);
		ContaCorrente cc4 = new ContaCorrente(44,44);

		cp1.setTitular(c1);
		cp2.setTitular(c2);
		cc3.setTitular(c3);
		cc4.setTitular(c4);

		RepositorioDeCategorias repo = new RepositorioDeCategorias();
		repo.AddCategoria(cp1);
		repo.AddCategoria(cp2);
		repo.AddCategoria(cc3);
		repo.AddCategoria(cc4);

		System.out.println("____________________");
		repo.ListaCategorias();
		System.out.println("____________________");
		repo.ListaQuantidade();
		System.out.println("____________________");
		repo.BuscaCategoria(3);
		System.out.println("____________________");
	}

}
