package com.aldo.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aldo.myinvest.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long>{

}
