package com.example.loja.aberta.domain.exception;

import lombok.Getter;

@Getter
public class RegraNegocioException extends RuntimeException {

    private Integer codigo;

    public RegraNegocioException() {
        super();
    }

    public RegraNegocioException(String message, Integer codigo) {
        super(message);
        this.codigo = codigo;
    }
}
