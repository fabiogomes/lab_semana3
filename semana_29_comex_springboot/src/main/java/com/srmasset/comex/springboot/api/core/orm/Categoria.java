package com.srmasset.comex.springboot.api.core.orm;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categoria")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "ativo", nullable = false)
    private Boolean ativo = Boolean.TRUE;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria(DadosCadastroCategoria dados) {
        this.nome = dados.nome();
    }
}
