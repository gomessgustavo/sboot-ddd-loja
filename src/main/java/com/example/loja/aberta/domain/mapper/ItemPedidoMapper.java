package com.example.loja.aberta.domain.mapper;

import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import com.example.loja.aberta.domain.model.ItemPedidoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ItemPedidoMapper {

    @Mapping(target = "nomeItem", source = "nomeItem")
    @Mapping(target = "valor", source = "valor")
    @Mapping(target = "descricao", source = "descricao")
    ItemPedidoEntity toItemPedido(CriarPedidoDTO data);
    List<ItemPedidoEntity> toItensList(List<CriarPedidoDTO> data);
}
