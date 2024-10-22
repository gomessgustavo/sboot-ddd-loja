package com.example.loja.aberta.application.mapper;

import com.example.loja.aberta.application.dto.response.ItemPedidoResponseDTO;
import com.example.loja.aberta.domain.model.ItemPedidoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ItemPedidoResponseMapper {
    @Mapping(target = "nomeItem", source = "nomeItem")
    @Mapping(target = "valor", source = "valor")
    @Mapping(target = "descricao", source = "descricao")
    ItemPedidoResponseDTO toResponse(ItemPedidoEntity data);
}
