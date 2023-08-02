//nao pode instanciar essa classe, pq é abstrata
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int senha;

    public Funcionario() {

    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public abstract double getBonificacao();

//    public double getBonificacao() {
//        //return this.salario * 0.5;
//        return -1;
//    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
