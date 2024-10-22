package com.example.loja.aberta.application.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CriarPedidoDTO {

    @NotBlank
    private String nomeItem;

    @NotNull
    private BigDecimal valor;

    @NotBlank
    private String descricao;
}
