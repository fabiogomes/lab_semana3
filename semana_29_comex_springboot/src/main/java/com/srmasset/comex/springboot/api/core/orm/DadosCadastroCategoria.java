package com.srmasset.comex.springboot.api.core.orm;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCategoria(
        @NotBlank
        @Pattern(regexp = ".{2,50}")
        String nome) {
}
