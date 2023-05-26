
public class TestaIPVA {
	public static void main(String[] args) {
		IPVAAutomovel carro = new IPVAAutomovel();
		IPVAMoto moto = new IPVAMoto();
		
		
		ControladorDeIPVA controle = new ControladorDeIPVA();
		controle.registra(carro.calcula(100000));
		controle.registra(moto.calcula(20000));
		
		System.out.println(controle.getTotalPagoIPVA());
	}

}
