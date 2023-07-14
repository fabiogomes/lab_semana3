
public class TesteCompra {
	public static void main(String[] args) {
		Cliente david = new ClienteBronze("David");		
		Compra cpDavid = new Compra(david);
		
		System.out.println("Pontos atuais: " + david.getPontos());
		
		cpDavid.registraCompra(26);
		System.out.println("Pontos atuais: " + david.getPontos());
		
		cpDavid.registraCompra(150);
		System.out.println("Pontos atuais: " + david.getPontos());
	}

}
