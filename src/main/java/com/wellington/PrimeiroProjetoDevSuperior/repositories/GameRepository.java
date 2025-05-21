package com.wellington.PrimeiroProjetoDevSuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.PrimeiroProjetoDevSuperior.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
