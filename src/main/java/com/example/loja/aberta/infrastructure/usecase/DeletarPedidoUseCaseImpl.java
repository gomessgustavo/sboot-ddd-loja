package com.example.loja.aberta.infrastructure.usecase;

import com.example.loja.aberta.application.usecase.DeletarPedidoUseCase;
import com.example.loja.aberta.domain.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Primary
@Component
@AllArgsConstructor
public class DeletarPedidoUseCaseImpl implements DeletarPedidoUseCase {

    private final PedidoService pedidoService;

    @Override
    public ResponseEntity deletarPedido(String id) {
        try {
            this.pedidoService.deletarPedido(id);
            return new ResponseEntity(HttpStatusCode.valueOf(200));
        } catch (Exception e) {
            return new ResponseEntity(HttpStatusCode.valueOf(404));
        }
    }
}
