
public class TesteSemana6 {
	public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("Bem vindo ao COMEX");
        System.out.println("============================");
        
        System.out.println();
        
        ControladorPontuacao controladorClientes = new ControladorPontuacao();
        
		Cliente david = new ClienteBronze("David");
		david.setNome("Sierra Valve");
		david.setCpf("111111111-1");
		david.setProfissao("Editor");
		
		System.out.println();
		
		controladorClientes.CarteiraFidelidade(david);
		
		System.out.println();
		
		Compra cp = new Compra(david, 26);
		cp.registraCompra(51);
		
		david = controladorClientes.atualizaStatus(cp);
		
        System.out.println("Total de Compras: " + cp.getTotalCompras());
        System.out.println("Sua pontuação: " + cp.getCliente().getPontos());
        System.out.println("Nível de Compras: " + david.statusPontuacao());
        System.out.println("======================================================");
	}

}
