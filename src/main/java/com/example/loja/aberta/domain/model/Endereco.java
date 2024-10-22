package com.example.loja.aberta.domain.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
}
