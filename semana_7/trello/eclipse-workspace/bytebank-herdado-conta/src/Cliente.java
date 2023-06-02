public abstract class Cliente { 
    private String nome; 
    private String cpf; 
    private String profissao;
    
	private double pontos = 0;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public abstract String statusPontuacao();
	        
    public double getPontos() {
		return pontos;
	}

	public void setPontos(double pontos) {
		this.pontos += pontos;
	}
    
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}