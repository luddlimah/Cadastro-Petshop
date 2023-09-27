package com.seuapp.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagamentoRepository<FormaPagamento> extends JpaRepository<FormaPagamento, Long> {
}
