package com.example.loja.aberta.application.dto.response;

import lombok.Data;

@Data
public class EnderecoResponseDTO {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
}
