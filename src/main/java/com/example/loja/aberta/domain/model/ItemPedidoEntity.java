package com.example.loja.aberta.domain.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "item_pedido")
public class ItemPedidoEntity {
    @UuidGenerator
    @Id
    private String id;
    private String nomeItem;
    private BigDecimal valor;
    private String descricao;
}
