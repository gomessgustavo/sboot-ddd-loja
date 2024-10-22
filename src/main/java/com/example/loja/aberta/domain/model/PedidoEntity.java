package com.example.loja.aberta.domain.model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@Entity(name = "pedido")
public class PedidoEntity {

    public PedidoEntity() {
        this.dataPedido = new Date();
        this.finalizado = Boolean.FALSE;
    }

    @UuidGenerator
    @Id
    private String id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "pedido_id")
    private List<ItemPedidoEntity> itemPedido;

    @Embedded
    @Nullable
    private Endereco enderecoEntrega;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pedido_id")
    @Nullable
    private CartaoEntity cartao;

    private Date dataPedido;

    private Boolean finalizado;

    public Boolean checkPedidoPodeFinalizar() {
        return this.cartao != null && this.enderecoEntrega != null;
    }
}
