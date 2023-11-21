package com.srmasset.comex.springboot.api.core.orm;

import jakarta.persistence.*;

@Embeddable
public class Endereco {
    @Column(name = "rua", nullable = false, length = 50)
    private String rua;
    @Column(name = "numero", nullable = false, length = 10)
    private String numero;
    @Column(name = "complemento", nullable = true, length = 50)
    private String complemento;
    @Column(name = "bairro", nullable = false, length = 50)
    private String bairro;
    @Column(name = "cidade", nullable = false, length = 50)
    private String cidade;
    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    public Endereco() {
    }

    public Endereco(String rua, String numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(DadosCadastroCliente dados) {
        this.rua = dados.endereco().rua;
        this.numero = String.valueOf(dados.endereco().numero);
        this.complemento = dados.endereco().complemento;
        this.bairro = dados.endereco().bairro;
        this.cidade = dados.endereco().cidade;
        this.estado = dados.endereco().estado;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
