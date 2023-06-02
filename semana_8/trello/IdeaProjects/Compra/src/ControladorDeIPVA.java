
public class ControladorDeIPVA {
	private double totalPagoIPVA = 0;

	public double getTotalPagoIPVA() {
		return totalPagoIPVA;
	}

	public void registra(double ipva) {
		this.totalPagoIPVA = this.totalPagoIPVA + ipva;
	}
}
