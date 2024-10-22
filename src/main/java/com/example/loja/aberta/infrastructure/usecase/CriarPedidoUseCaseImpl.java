package com.example.loja.aberta.infrastructure.usecase;

import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import com.example.loja.aberta.application.usecase.CriarPedidoUseCase;
import com.example.loja.aberta.domain.mapper.ItemPedidoMapper;
import com.example.loja.aberta.domain.model.ItemPedidoEntity;
import com.example.loja.aberta.domain.model.PedidoEntity;
import com.example.loja.aberta.domain.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Primary
@Component
@AllArgsConstructor
public class CriarPedidoUseCaseImpl implements CriarPedidoUseCase {

    private final PedidoService pedidoService;

    private final ItemPedidoMapper itemPedidoMapper;

    @Override
    public ResponseEntity criarPedido(CriarPedidoDTO criarPedidoDTO) {
        try {
            PedidoEntity novoPedido = new PedidoEntity();
            ItemPedidoEntity itemPedido = itemPedidoMapper.toItemPedido(criarPedidoDTO);
            novoPedido.setItemPedido(List.of(itemPedido));
            this.pedidoService.criarPedido(novoPedido);
            return new ResponseEntity(HttpStatusCode.valueOf(201));
        } catch (Exception e) {
            return new ResponseEntity(HttpStatusCode.valueOf(404));
        }
    }
}
