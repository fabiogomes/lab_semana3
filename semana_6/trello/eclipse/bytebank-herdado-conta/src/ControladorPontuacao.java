
public class ControladorPontuacao {	
	public Cliente atualizaStatus(Compra compra ) {
		
		if((compra.getCliente().getPontos() >= 5) & (compra.getCliente().getPontos() <= 9)) {
			ClienteBronze cb = new ClienteBronze();
			cb.setNome(compra.getCliente().getNome());
			cb.setCpf(compra.getCliente().getCpf());
			cb.setProfissao(compra.getCliente().getProfissao());
			cb.setPontos(compra.getCliente().getPontos());
			return cb;		
		
		}else if((compra.getCliente().getPontos() >= 10) & (compra.getCliente().getPontos() <= 14)) {
			ClientePrata cp = new ClientePrata();
			cp.setNome(compra.getCliente().getNome());
			cp.setCpf(compra.getCliente().getCpf());
			cp.setProfissao(compra.getCliente().getProfissao());
			cp.setPontos(compra.getCliente().getPontos());
			return cp;		
		
		}else if(compra.getCliente().getPontos() >= 15){
			ClienteOuro co = new ClienteOuro();
			co.setNome(compra.getCliente().getNome());
			co.setCpf(compra.getCliente().getCpf());
			co.setProfissao(compra.getCliente().getProfissao());
			co.setPontos(compra.getCliente().getPontos());
			return co;
		}
		
        Cliente outroCliente = new Cliente();
        outroCliente.setNome(compra.getCliente().getNome());
        outroCliente.setCpf(compra.getCliente().getCpf());
        outroCliente.setProfissao(compra.getCliente().getProfissao());
        outroCliente.setPontos(compra.getCliente().getPontos());
        
		return outroCliente;
			
	}
	
	public void CarteiraFidelidade(Cliente cliente) {
		System.out.println("*****************************************************");
		System.out.println("* :: Cartao de Fidelidade COMEX ::");
		System.out.println("* NOME: " + cliente.getNome());
		System.out.println("* SALDO DE ESTRELAS: " + cliente.getPontos());
		System.out.println("* CATEGORIA DE Cliente: " + cliente.statusPontuacao());
		System.out.println("*****************************************************");
	}
}
