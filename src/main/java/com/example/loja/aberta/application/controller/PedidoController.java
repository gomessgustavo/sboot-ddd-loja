package com.example.loja.aberta.application.controller;

import com.example.loja.aberta.application.dto.request.AdicionarCartaoDTO;
import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import com.example.loja.aberta.application.dto.request.EnderecoRequestDTO;
import com.example.loja.aberta.application.dto.response.FinalizarPedidoResponseDTO;
import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import com.example.loja.aberta.application.usecase.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pedido")
@RestController
@RequiredArgsConstructor
public class PedidoController {

    private final CriarPedidoUseCase criarPedidoUseCase;

    private final AdicionarItemPedidoUseCase adicionarItemPedidoUseCase;

    private final DeletarPedidoUseCase deletarPedidoUseCase;

    private final GetPedidoUseCase getPedidoUseCase;

    private final FinalizarPedidoUseCase finalizarPedidoUseCase;

    @PostMapping()
    public ResponseEntity criarPedido(@RequestBody CriarPedidoDTO criarPedidoDTO) {
        return this.criarPedidoUseCase.criarPedido(criarPedidoDTO);
    }

    @PostMapping("/{id}")
    public ResponseEntity<FinalizarPedidoResponseDTO> finalizarPedido(@PathVariable(name = "id") String idPedido) {
        return finalizarPedidoUseCase.finalizarPedido(idPedido);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PedidoResponseDTO> adicionarItensPedido(@PathVariable(name = "id") String idPedido, @RequestBody List<CriarPedidoDTO> listaItens) {
        return adicionarItemPedidoUseCase.adicionarItens(idPedido, listaItens);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity apagarPedido(@PathVariable(name = "id") String idPedido) {
        return deletarPedidoUseCase.deletarPedido(idPedido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoResponseDTO> getPedido(@PathVariable(name = "id") String idPedido) {
        return getPedidoUseCase.buscaPedido(idPedido);
    }

}
