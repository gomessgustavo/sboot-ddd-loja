package com.example.loja.aberta.application.usecase;

import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import com.example.loja.aberta.application.dto.response.FinalizarPedidoResponseDTO;
import org.springframework.http.ResponseEntity;

public interface FinalizarPedidoUseCase {
    ResponseEntity<FinalizarPedidoResponseDTO> finalizarPedido(String id);
}
