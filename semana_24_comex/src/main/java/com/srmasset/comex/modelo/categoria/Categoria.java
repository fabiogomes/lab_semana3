package com.srmasset.comex.modelo.categoria;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long COD_CATEGORIA;
    private String NOME;
    private Boolean STATUS = Boolean.TRUE;

    public Categoria(){}

    public Categoria(String nome, Boolean status){
        this.NOME = nome;
        this.STATUS = status;
    }

    public Long getCOD_CATEGORIA() {
        return COD_CATEGORIA;
    }

    public void setCOD_CATEGORIA(Long COD_CATEGORIA) {
        this.COD_CATEGORIA = COD_CATEGORIA;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public Boolean getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Boolean STATUS) {
        this.STATUS = STATUS;
    }
}
