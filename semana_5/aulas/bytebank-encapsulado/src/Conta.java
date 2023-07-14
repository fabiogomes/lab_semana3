

public class Conta {
	private static int total;
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
    public Conta( int agencia, int numero) {
    	Conta.total++;
    	System.out.println("o total de contas é " + Conta.total);
    	
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estou criando uma nova conta numero: " + this.numero + ", Agencia numero: " + this.agencia);
    }
    
    public static int getTotal() { 
        return Conta.total; 
    }
	
	public void deposita(double valor) { 
	    this.saldo += valor;
	} 

	public boolean saca(double valor) { 
	    if(this.saldo >= valor) { 
	        this.saldo -= valor; 
	        return true;
	    } else {
	        return false;
	    }
	} 
	
    public boolean transfere(double valor, Conta destino) { 
        if(this.saldo >= valor) { 
            this.saldo -= valor; 
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public double getSaldo() { 
        return this.saldo;
    }
    
    public int getNumero() { 
        return this.numero;
    }
    
    public void setNumero(int numero) { 
        if (numero <= 0) {
            System.out.println("não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(int agencia) { 
        if (agencia <= 0) { 
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;            
    }
    
    public Cliente getTitular() {
		return titular;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
