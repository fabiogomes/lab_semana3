package com.srmasset.comex.modelo.categoria;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String NOME;
    private Boolean STATUS = Boolean.TRUE;

    public Categoria(){}

    public Categoria(String nome){
        this.NOME = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNOME() {
        return NOME;
    }

    public Boolean getSTATUS() {
        return STATUS;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public void setSTATUS(Boolean STATUS) {
        this.STATUS = STATUS;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", NOME='" + NOME + '\'' +
                ", STATUS=" + STATUS +
                '}';
    }
}
