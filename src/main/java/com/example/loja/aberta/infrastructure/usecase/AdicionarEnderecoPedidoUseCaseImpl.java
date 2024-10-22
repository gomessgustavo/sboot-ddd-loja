package com.example.loja.aberta.infrastructure.usecase;

import com.example.loja.aberta.application.dto.request.EnderecoRequestDTO;
import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import com.example.loja.aberta.application.mapper.EnderecoMapper;
import com.example.loja.aberta.application.mapper.PedidoMapper;
import com.example.loja.aberta.application.usecase.AdicionarEnderecoPedidoUseCase;
import com.example.loja.aberta.domain.exception.RegraNegocioException;
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
public class AdicionarEnderecoPedidoUseCaseImpl implements AdicionarEnderecoPedidoUseCase {

    private final PedidoService pedidoService;

    private final EnderecoMapper enderecoMapper;

    private final PedidoMapper pedidoMapper;

    @Override
    public ResponseEntity<PedidoResponseDTO> adicionarEndereco(String id, EnderecoRequestDTO endereco) {
        try {
            PedidoEntity pedido = pedidoService.getPedido(id);
            pedido.setEnderecoEntrega(enderecoMapper.requestToValueObject(endereco));
            this.pedidoService.alterarPedido(pedido);
            return new ResponseEntity(pedidoMapper.toResponse(pedido), HttpStatusCode.valueOf(200));
        } catch (RegraNegocioException e) {
            return new ResponseEntity(e.getMessage(), HttpStatusCode.valueOf(e.getCodigo()));
        }
    }
}
