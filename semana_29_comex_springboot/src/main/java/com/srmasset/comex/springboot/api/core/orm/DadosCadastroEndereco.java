package com.srmasset.comex.springboot.api.core.orm;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroEndereco(
        @NotBlank
        String rua,
        @NotNull
        @DecimalMin("0")
        Integer numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String estado){
}
