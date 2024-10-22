package com.example.loja.aberta.domain.repository;

import com.example.loja.aberta.domain.model.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoEntity, String> {}
