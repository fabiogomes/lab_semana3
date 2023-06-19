package br.com.bytebank.banco.test.util;
import br.com.bytebank.banco.modelo.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        LinkedList<Conta> lista = new LinkedList<Conta>();
//
		List<Conta> lista = new ArrayList<Conta>();
		
		//Generics
        //List<Conta> lista = new Vector<Conta>();//thread safe
		
        Conta cc = new ContaCorrente(22, 11);
		//Cliente cliente = new Cliente();
		lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println("Tamanho: " + lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        
        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());
        
        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);
        
//        for(int i = 0; i < lista.size(); i++) {
//            Object oRef = lista.get(i);
//            System.out.println(oRef);
//        }
        
//        for(Object o : lista) {
//            System.out.println(o);
//        }
        
        for(Conta conta : lista) {
            System.out.println(conta);
        }
	}

}
