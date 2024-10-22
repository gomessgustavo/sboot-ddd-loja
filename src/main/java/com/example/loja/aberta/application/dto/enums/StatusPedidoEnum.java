package com.example.loja.aberta.application.dto.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusPedidoEnum {
    FINALIZADO("Finalizado com sucesso."),
    FALTA_INFORMACAO("Falta informações de endereço ou cartão.");

    private final String mensagem;

}
