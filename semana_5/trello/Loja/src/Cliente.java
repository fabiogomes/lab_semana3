public class Cliente {
    private String nome;
    private String cpf;
    private String mail;
    private String profissao;
    private String telefone;
    private Endereco endereco = new Endereco();

    public Cliente(String nome, String cpf){
        if((nome == "") || (cpf == "")){
            System.out.println("Atributos não devem ficar vazios");
        }
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome, String cpf, String mail){
//        if((nome == "") || (cpf == "") || (mail == "")){
//            System.out.println("Atributos não devem ficar vazios");
//        }
//        this.nome = nome;
//        this.cpf = cpf;
//        this.mail = mail;     TESTE
        this(nome, cpf);
        if(mail == ""){
            System.out.println("Atributos não devem ficar vazios");
        }
        this.nome = nome;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
