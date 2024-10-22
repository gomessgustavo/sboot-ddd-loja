package com.example.loja.aberta.application.dto.response;

import com.example.loja.aberta.application.dto.enums.StatusPedidoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinalizarPedidoResponseDTO {
    private StatusPedidoEnum status;
    private String mensagem;

    public FinalizarPedidoResponseDTO(StatusPedidoEnum status) {
        this.status = status;
        this.mensagem = status.getMensagem();
    }
}
