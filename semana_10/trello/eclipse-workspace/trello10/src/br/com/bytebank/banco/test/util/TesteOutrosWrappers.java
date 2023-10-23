package br.com.bytebank.banco.test.util;
import java.util.List;
import java.util.ArrayList;
public class TesteOutrosWrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); //unboxing

        Double dRef = Double.valueOf(3.2);//autoboxing
        System.out.println(dRef.doubleValue());//unboxing

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumero = Integer.valueOf(29);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);
	}

}
