package com.example.loja.aberta.application.dto.response;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PedidoResponseDTO {
    private String id;

    private List<ItemPedidoResponseDTO> itemPedido;

    private EnderecoResponseDTO enderecoEntrega;

    private CartaoResponseDTO cartao;

    private Date dataPedido;
}
