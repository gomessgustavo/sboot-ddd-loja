package com.example.loja.aberta.application.controller;

import com.example.loja.aberta.application.dto.request.AdicionarCartaoDTO;
import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import com.example.loja.aberta.application.usecase.AdicionarCartaoPedidoUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/cartao")
@RestController
@RequiredArgsConstructor
public class CartaoController {

    private final AdicionarCartaoPedidoUseCase adicionarCartaoPedidoUseCase;

    @PutMapping("/{pedidoId}")
    public ResponseEntity<PedidoResponseDTO> adicionarCartao(@PathVariable(name = "pedidoId") String idPedido, @Valid @RequestBody AdicionarCartaoDTO request) {
        return adicionarCartaoPedidoUseCase.adicionarCartao(idPedido, request);
    }
}
