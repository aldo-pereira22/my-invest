package com.aldo.myinvest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aldo.myinvest.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	
}
