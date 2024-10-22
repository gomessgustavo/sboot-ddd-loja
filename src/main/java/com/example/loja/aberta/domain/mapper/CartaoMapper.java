package com.example.loja.aberta.domain.mapper;

import com.example.loja.aberta.application.dto.request.AdicionarCartaoDTO;
import com.example.loja.aberta.application.dto.request.CriarPedidoDTO;
import com.example.loja.aberta.application.dto.response.CartaoResponseDTO;
import com.example.loja.aberta.domain.model.CartaoEntity;
import com.example.loja.aberta.domain.model.ItemPedidoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CartaoMapper {
    CartaoEntity toEntity(AdicionarCartaoDTO data);
    CartaoResponseDTO toResponse(CartaoEntity data);
}
