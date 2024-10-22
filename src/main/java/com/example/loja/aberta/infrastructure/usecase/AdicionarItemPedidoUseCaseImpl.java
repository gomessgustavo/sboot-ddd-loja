package com.example.loja.aberta.infrastructure.usecase;

import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import com.example.loja.aberta.application.mapper.PedidoMapper;
import com.example.loja.aberta.application.usecase.AdicionarItemPedidoUseCase;
import com.example.loja.aberta.domain.exception.RegraNegocioException;
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
public class AdicionarItemPedidoUseCaseImpl implements AdicionarItemPedidoUseCase {

    private final PedidoService pedidoService;

    private final ItemPedidoMapper itemPedidoMapper;

    private final PedidoMapper pedidoMapper;

    @Override
    public ResponseEntity<PedidoResponseDTO> adicionarItens(String id, List<CriarPedidoDTO> itens) {
        try {
            PedidoEntity pedido = pedidoService.getPedido(id);
            List<ItemPedidoEntity> novosItens = itemPedidoMapper.toItensList(itens);
            pedido.getItemPedido().addAll(novosItens);
            pedidoService.alterarPedido(pedido);
            return new ResponseEntity(pedidoMapper.toResponse(pedido), HttpStatusCode.valueOf(200));
        } catch (RegraNegocioException e) {
            return new ResponseEntity(e.getMessage(), HttpStatusCode.valueOf(e.getCodigo()));
        }
    }
}
