package com.example.loja.aberta.infrastructure.usecase;

import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import com.example.loja.aberta.application.mapper.PedidoMapper;
import com.example.loja.aberta.application.usecase.CriarPedidoUseCase;
import com.example.loja.aberta.application.usecase.GetPedidoUseCase;
import com.example.loja.aberta.domain.mapper.ItemPedidoMapper;
import com.example.loja.aberta.domain.model.ItemPedidoEntity;
import com.example.loja.aberta.domain.model.PedidoEntity;
import com.example.loja.aberta.domain.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Primary
@Component
@AllArgsConstructor
public class GetPedidoUseCaseImpl implements GetPedidoUseCase {

    private final PedidoService pedidoService;

    private final PedidoMapper pedidoMapper;


    @Override
    public ResponseEntity<PedidoResponseDTO> buscaPedido(String id) {
        try {
            PedidoEntity pedido = this.pedidoService.getPedido(id);
            return new ResponseEntity(pedidoMapper.toResponse(pedido), HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity(HttpStatusCode.valueOf(404));
        }
    }
}
