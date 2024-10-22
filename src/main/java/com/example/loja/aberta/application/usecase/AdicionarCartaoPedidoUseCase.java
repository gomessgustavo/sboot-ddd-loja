package com.example.loja.aberta.application.usecase;

import com.example.loja.aberta.application.dto.request.AdicionarCartaoDTO;
import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import org.springframework.http.ResponseEntity;

public interface AdicionarCartaoPedidoUseCase {
    ResponseEntity<PedidoResponseDTO> adicionarCartao(String id, AdicionarCartaoDTO request);
}
