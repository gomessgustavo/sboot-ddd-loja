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
@Entity(name = "cartao")
public class CartaoEntity {
    @UuidGenerator
    @Id
    private String id;
    private String numero;
    private Integer cvv;
    private Integer mesValidade;
    private Integer anoValidade;
}
