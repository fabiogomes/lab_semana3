
public class Compra {
	private Cliente cliente;
	private double totalCompras;
	
	public Compra(Cliente cliente, double valor) {
		if(cliente == null){
			throw new NullPointerException("Cliente nao pode ser nulo");
		} else{
		this.cliente = cliente;
		}

		if(valor>=1){
			this.totalCompras += valor;
		}

		if(valor<=0){
			throw new ArithmeticException("Valor nao pode ser <= 0");

		} else if((this.totalCompras >= 25) && (this.totalCompras <= 50)) {
			this.cliente.setPontos(5);

		}else if((this.totalCompras >= 50.1) && (this.totalCompras <= 100.9)) {
			this.cliente.setPontos(10);

		}else if(this.totalCompras >= 101){
			this.cliente.setPontos(15);
		}
	}

	public void registraCompra(double valor){
		if(valor>=1){
			this.totalCompras += valor;
		}

		if(valor<=0){
			throw new ArithmeticException("Valor nao pode ser <= 0");

		} else if((this.totalCompras >= 25) && (this.totalCompras <= 50)) {
			this.cliente.setPontos(5);

		}else if((this.totalCompras >= 50.1) && (this.totalCompras <= 100.9)) {
			this.cliente.setPontos(10);

		}else if(this.totalCompras >= 101){
			this.cliente.setPontos(15);
		}
	}

    public Cliente getCliente() {
        return cliente;
    }
	
	public double getTotalCompras() {
		return totalCompras;
	}
}
