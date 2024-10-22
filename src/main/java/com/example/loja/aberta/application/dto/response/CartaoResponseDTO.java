package com.example.loja.aberta.application.dto.response;

import lombok.Data;

@Data
public class CartaoResponseDTO {
    private String numero;

    private Integer cvv;

    private Integer mesValidade;

    private Integer anoValidade;
}
