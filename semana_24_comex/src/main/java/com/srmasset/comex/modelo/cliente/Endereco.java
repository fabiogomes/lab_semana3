package com.srmasset.comex.modelo.cliente;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "CLIENTE")
@Embeddable
public class Endereco {
    private String RUA;
    private String NUMERO;
    private String COMPLEMENTO;
    private String BAIRRO;
    private String CIDADE;
    private String ESTADO;

    public Endereco() {
    }

    public Endereco(String RUA, String NUMERO, String BAIRRO, String CIDADE, String ESTADO) {
        this.RUA = RUA;
        this.NUMERO = NUMERO;
        this.BAIRRO = BAIRRO;
        this.CIDADE = CIDADE;
        this.ESTADO = ESTADO;
    }

    public String getRUA() {
        return RUA;
    }

    public void setRUA(String RUA) {
        this.RUA = RUA;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }

    public void setCOMPLEMENTO(String COMPLEMENTO) {
        this.COMPLEMENTO = COMPLEMENTO;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public String getESTADO() {
        return ESTADO;
    }

    public void setESTADO(String ESTADO) {
        this.ESTADO = ESTADO;
    }
}
