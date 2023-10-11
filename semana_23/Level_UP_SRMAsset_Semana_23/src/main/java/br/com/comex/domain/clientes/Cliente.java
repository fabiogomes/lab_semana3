package br.com.comex.domain.clientes;

import java.util.Objects;

public class Cliente {
    private Integer cod_cliente;
    private String nome;
    private String email;
    private String cpf;
    private String tel1;
    private String tel2;
    private String bairro;
    private String cidade;

    public Cliente(DadosCriacaoCliente dados){
        this.cod_cliente = dados.cod_cliente();
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.tel1 =dados.tel1();
        this.tel2 = dados.tel2();
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return cod_cliente.equals(cliente.cod_cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod_cliente);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cod_cliente='" + cod_cliente + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", tel1='" + tel1 + '\'' +
                ", tel2='" + tel2 + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public Integer getCod_cliente() {
        return cod_cliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTel1() {
        return tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }
}
