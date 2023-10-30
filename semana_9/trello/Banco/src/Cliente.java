public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;

    public Cliente(String nome){
        if(nome == ""){
            throw new RuntimeException("O valor não pode ser vazio");
        }else if(nome == null){
            throw new RuntimeException("O Valor não pode ser nulo");
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome == ""){
            throw new RuntimeException("O valor não pode ser vazio");
        }else if(nome == null){
            throw new RuntimeException("O Valor não pode ser nulo");
        } else {
            this.nome = nome;
        }
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
