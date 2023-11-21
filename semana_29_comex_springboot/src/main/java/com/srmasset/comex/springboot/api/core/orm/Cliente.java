package com.srmasset.comex.springboot.api.core.orm;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cpf", nullable = false, length = 14)
    private String cpf;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "telefone", nullable = false, length = 18)
    private String telefone;
    @Embedded
    private Endereco endereco;

    public Cliente(String cpf, String nome, String telefone, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
