package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaPoupanca, " + super.toString();
	}

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
}
