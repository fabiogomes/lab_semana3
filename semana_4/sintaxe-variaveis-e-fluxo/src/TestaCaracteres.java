
public class TestaCaracteres {
	public static void main(String[] args) {
		char letra  = 'a';
		System.out.println(letra);
		char valor = 66;
		System.out.println(valor);
		//valor = valor + 1;
		//System.out.println(valor); erro devido a 1 ser int e valor ser char, logo 1 nao cabe em char
		
		valor = (char) (valor + 1); //efetuando o casting funciona
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}

}
