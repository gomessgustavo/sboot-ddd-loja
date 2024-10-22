package com.example.loja.aberta.domain.service;

import com.example.loja.aberta.domain.model.PedidoEntity;

public interface PedidoService {
    void criarPedido(PedidoEntity pedido);
    PedidoEntity getPedido(String id);
    PedidoEntity alterarPedido(PedidoEntity pedido);
    PedidoEntity finalizarPedido(PedidoEntity pedido);
    void deletarPedido(String id);
}
