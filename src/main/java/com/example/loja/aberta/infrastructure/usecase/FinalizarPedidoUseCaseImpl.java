package com.example.loja.aberta.infrastructure.usecase;

import com.example.loja.aberta.application.dto.enums.StatusPedidoEnum;
import com.example.loja.aberta.application.dto.response.FinalizarPedidoResponseDTO;
import com.example.loja.aberta.application.mapper.PedidoMapper;
import com.example.loja.aberta.application.usecase.FinalizarPedidoUseCase;
import com.example.loja.aberta.domain.model.PedidoEntity;
import com.example.loja.aberta.domain.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Primary
@Component
@AllArgsConstructor
public class FinalizarPedidoUseCaseImpl implements FinalizarPedidoUseCase {

    private final PedidoService pedidoService;

    private final PedidoMapper pedidoMapper;


    @Override
    public ResponseEntity<FinalizarPedidoResponseDTO> finalizarPedido(String id) {
        try {
            PedidoEntity pedido = this.pedidoService.getPedido(id);
            if(pedido.checkPedidoPodeFinalizar()) {
                pedidoService.finalizarPedido(pedido);
                FinalizarPedidoResponseDTO response = new FinalizarPedidoResponseDTO(StatusPedidoEnum.FINALIZADO);
                return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
            }
            FinalizarPedidoResponseDTO response = new FinalizarPedidoResponseDTO(StatusPedidoEnum.FALTA_INFORMACAO);
            return new ResponseEntity<>(response, HttpStatusCode.valueOf(404));
        } catch (Exception e) {
            return new ResponseEntity(HttpStatusCode.valueOf(404));
        }
    }
}
