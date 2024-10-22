package com.example.loja.aberta.application.usecase;

import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AdicionarItemPedidoUseCase {
    ResponseEntity<PedidoResponseDTO> adicionarItens(String id, List<CriarPedidoDTO> itens);
}
