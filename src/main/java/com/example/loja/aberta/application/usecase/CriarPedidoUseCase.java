package com.example.loja.aberta.application.usecase;

import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import org.springframework.http.ResponseEntity;

public interface CriarPedidoUseCase {
    ResponseEntity criarPedido(CriarPedidoDTO criarPedidoDTO);
}
