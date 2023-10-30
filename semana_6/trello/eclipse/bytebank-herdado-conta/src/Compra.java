
public class Compra {
	private Cliente cliente;
	private double totalCompras;
	
	public Compra(Cliente cliente) {
		this.cliente = cliente;
	}
	
    public Cliente getCliente() {
        return cliente;
    }
	
	public double getTotalCompras() {
		return totalCompras;
	}

	public void registraCompra(double compra) {
		this.totalCompras += compra;
		
		if((this.totalCompras >= 25) && (this.totalCompras <= 50)) {
			this.cliente.setPontos(5);
		
		}else if((this.totalCompras >= 50.1) && (this.totalCompras <= 100.9)) {
			this.cliente.setPontos(10);
		
		}else if(this.totalCompras >= 101){
			this.cliente.setPontos(15);
		}
			
	}
}
