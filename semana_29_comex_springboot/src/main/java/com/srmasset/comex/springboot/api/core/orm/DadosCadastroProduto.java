package com.srmasset.comex.springboot.api.core.orm;

import com.srmasset.comex.springboot.api.core.repository.CategoriaRepository;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Currency;

import java.math.BigDecimal;

public record DadosCadastroProduto(
        @NotNull
        Long categoriaId,
        @NotBlank
        @Pattern(regexp = ".{2,}")
        String nome,

        @NotNull
        @DecimalMin("0")
        BigDecimal preco,

        String descricao,

        @NotNull
        Integer estoque
        ) {
}
