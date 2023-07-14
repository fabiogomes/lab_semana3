package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.ArrayList;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int idade = 29;
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue(); //unboxing
        String s = args[0];//"10"
        //Integer numero = Integer.valueOf(s);
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing
	}
}
