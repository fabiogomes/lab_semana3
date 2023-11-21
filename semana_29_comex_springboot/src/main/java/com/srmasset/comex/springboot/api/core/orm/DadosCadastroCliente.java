package com.srmasset.comex.springboot.api.core.orm;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank
        @Pattern(regexp = "\\.{11,14}")
        String cpf,
        @NotBlank
        @Pattern(regexp = "\\.{14,17}")
        String telefone,

        @NotNull
        @Valid
        Endereco endereco){
}