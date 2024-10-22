package com.example.loja.aberta.application.mapper;

import com.example.loja.aberta.application.dto.request.EnderecoRequestDTO;
import com.example.loja.aberta.application.dto.response.EnderecoResponseDTO;
import com.example.loja.aberta.domain.model.Endereco;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EnderecoMapper {
    EnderecoResponseDTO toResponse(Endereco data);
    Endereco requestToValueObject(EnderecoRequestDTO data);
}
