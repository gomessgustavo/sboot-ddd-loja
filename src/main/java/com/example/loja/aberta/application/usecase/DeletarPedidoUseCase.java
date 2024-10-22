package com.example.loja.aberta.application.usecase;

import org.springframework.http.ResponseEntity;

public interface DeletarPedidoUseCase {
    ResponseEntity deletarPedido(String id);
}
