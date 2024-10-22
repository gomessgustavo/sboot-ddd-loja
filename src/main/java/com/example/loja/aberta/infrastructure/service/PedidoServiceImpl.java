package com.example.loja.aberta.infrastructure.service;

import com.example.loja.aberta.domain.exception.RegraNegocioException;
import com.example.loja.aberta.domain.model.PedidoEntity;
import com.example.loja.aberta.domain.repository.PedidoRepository;
import com.example.loja.aberta.domain.service.PedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository pedidoRepository;

    @Override
    public void criarPedido(PedidoEntity pedido) {
        this.pedidoRepository.save(pedido);
    }

    @Override
    public PedidoEntity getPedido(String id) {
        return this.pedidoRepository.getReferenceById(id);
    }

    @Override
    public PedidoEntity alterarPedido(PedidoEntity pedido) {
        if(pedido.getFinalizado()) {
            throw new RegraNegocioException("Pedido já está finalizado!", 422);
        }
        return this.pedidoRepository.save(pedido);
    }

    @Override
    public PedidoEntity finalizarPedido(PedidoEntity pedido) {
        pedido.setFinalizado(true);
        return this.pedidoRepository.save(pedido);
    }

    @Override
    public void deletarPedido(String id) {
        this.pedidoRepository.deleteById(id);
    }
}
