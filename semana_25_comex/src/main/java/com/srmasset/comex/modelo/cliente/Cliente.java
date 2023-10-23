package com.srmasset.comex.modelo.cliente;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente{
    @Id
    private String CPF;
    private String NOME;
    private String TELEFONE;
    @Embedded
    private Endereco ENDERECO;

    public Cliente(){}

    public Cliente(String CPF, String NOME, String TELEFONE, Endereco ENDERECO) {
        this.CPF = CPF;
        this.NOME = NOME;
        this.TELEFONE = TELEFONE;
        this.ENDERECO = ENDERECO;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getTELEFONE() {
        return TELEFONE;
    }

    public void setTELEFONE(String TELEFONE) {
        this.TELEFONE = TELEFONE;
    }

    public Endereco getENDERECO() {
        return ENDERECO;
    }

    public void setENDERECO(Endereco ENDERECO) {
        this.ENDERECO = ENDERECO;
    }

    //    public String getRUA() {
//        return RUA;
//    }
//
//    public void setRUA(String RUA) {
//        this.RUA = RUA;
//    }
//
//    public String getNUMERO() {
//        return NUMERO;
//    }
//
//    public void setNUMERO(String NUMERO) {
//        this.NUMERO = NUMERO;
//    }
//
//    public String getCOMPLEMENTO() {
//        return COMPLEMENTO;
//    }
//
//    public void setCOMPLEMENTO(String COMPLEMENTO) {
//        this.COMPLEMENTO = COMPLEMENTO;
//    }
//
//    public String getBAIRRO() {
//        return BAIRRO;
//    }
//
//    public void setBAIRRO(String BAIRRO) {
//        this.BAIRRO = BAIRRO;
//    }
//
//    public String getCIDADE() {
//        return CIDADE;
//    }
//
//    public void setCIDADE(String CIDADE) {
//        this.CIDADE = CIDADE;
//    }
//
//    public String getESTADO() {
//        return ESTADO;
//    }
//
//    public void setESTADO(String ESTADO) {
//        this.ESTADO = ESTADO;
//    }


    @Override
    public String toString() {
        return "Cliente{" +
                "CPF='" + CPF + '\'' +
                ", NOME='" + NOME + '\'' +
                '}';
    }
}
