package com.example.loja.aberta.application.controller;

import com.example.loja.aberta.application.dto.request.AdicionarCartaoDTO;
import com.example.loja.aberta.application.dto.request.EnderecoRequestDTO;
import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import com.example.loja.aberta.application.usecase.AdicionarCartaoPedidoUseCase;
import com.example.loja.aberta.application.usecase.AdicionarEnderecoPedidoUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/endereco")
@RestController
@RequiredArgsConstructor
public class EnderecoController {

    private final AdicionarEnderecoPedidoUseCase adicionarEnderecoPedidoUseCase;

    @PutMapping("/{idPedido}")
    public ResponseEntity<PedidoResponseDTO> adicionarEndereco(@PathVariable(name = "idPedido") String idPedido, @Valid @RequestBody EnderecoRequestDTO request) {
        return adicionarEnderecoPedidoUseCase.adicionarEndereco(idPedido, request);
    }
}
