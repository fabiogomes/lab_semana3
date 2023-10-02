package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no Bytebank 
 * 
 * @author André Chaves
 * @version 0.1
 */
public class Cliente {

    private String nome;
    private String cpf;
    private String profissao;
    private String data;
    private String email;

    public String getNome() {
        return nome;
    }
    public String getNomeEmMaiusculo() {
        String nomeEmMaiusculo = nome.toUpperCase();
        return nomeEmMaiusculo;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "[ Nome" + this.nome + "| Data de Nascimento" + this.data + "| Email:" + this.email + " ]";
    }
}
