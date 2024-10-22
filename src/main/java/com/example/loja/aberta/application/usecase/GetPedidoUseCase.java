package com.example.loja.aberta.application.usecase;

import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import org.springframework.http.ResponseEntity;

public interface GetPedidoUseCase {
    ResponseEntity<PedidoResponseDTO> buscaPedido(String id);
}
