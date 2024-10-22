package com.example.loja.aberta.application.mapper;

import com.example.loja.aberta.application.dto.response.PedidoResponseDTO;
import com.example.loja.aberta.domain.mapper.CartaoMapper;
import com.example.loja.aberta.domain.model.PedidoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        uses = {ItemPedidoResponseMapper.class, EnderecoMapper.class, CartaoMapper.class})
public interface PedidoMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "itemPedido", source = "itemPedido")
    @Mapping(target = "enderecoEntrega", source = "enderecoEntrega")
    @Mapping(target = "dataPedido", source = "dataPedido")
    @Mapping(target = "cartao", source = "cartao")
    PedidoResponseDTO toResponse(PedidoEntity data);
}
