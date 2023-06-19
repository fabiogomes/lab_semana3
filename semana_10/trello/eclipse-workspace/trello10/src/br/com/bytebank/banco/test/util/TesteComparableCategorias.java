package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

//br.com.bytebank.banco.test.TesteContas 
public class TesteComparableCategorias {

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

		RepositorioDeCategorias corrente = new RepositorioDeCategorias();
		corrente.AddCategoria(cc3);
		corrente.AddCategoria(cc4);
		RepositorioDeCategorias poupanca = new RepositorioDeCategorias();
		poupanca.AddCategoria(cp1);
		poupanca.AddCategoria(cp2);


		List<RepositorioDeCategorias> lista = new ArrayList();
		lista.add(poupanca);
		lista.add(corrente);
		
		for(RepositorioDeCategorias repo : lista) {
			repo.ListaCategorias();
		}
		System.out.println("________________________");
		
		NomeCategoriaComparator comparador = new NomeCategoriaComparator();
		lista.sort(comparador);
		
		for(RepositorioDeCategorias repo : lista) {
			repo.ListaCategorias();
		}
		System.out.println("________________________");
	}

}

class NomeCategoriaComparator implements Comparator<RepositorioDeCategorias> {
    @Override
    public int compare(RepositorioDeCategorias c1, RepositorioDeCategorias c2) {

        String nomeC1 = c1.toString();
        String nomeC2 = c2.toString();
        return nomeC1.compareTo(nomeC2);
    }
}