package com.aldo.myinvest;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aldo.myinvest.domain.Categoria;
import com.aldo.myinvest.domain.Investimento;
import com.aldo.myinvest.repository.CategoriaRepository;
import com.aldo.myinvest.repository.InvestimentoRepository;

@SpringBootApplication
public class MyInvestApplication implements CommandLineRunner{
	
	@Autowired
	CategoriaRepository categoriaRepositorio;
	
	@Autowired
	InvestimentoRepository investimentoRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyInvestApplication.class, args);
		
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Categoria ca = new Categoria();
		ca.setDescricao("CATEGORIA TESTE");
		ca.setNome("Teste");
		
		categoriaRepositorio.save(ca);
		
		Investimento invest = new Investimento();
		invest.setCategoria(ca);
		invest.setDataCompra(LocalDate.now());
		invest.setQuantidadeCotas(10);
		invest.setValor("12.90");
		invest.setValorCota(12.10);
		
		investimentoRepository.save(invest);
	
		
	}
}
