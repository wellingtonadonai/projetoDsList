package com.wellington.PrimeiroProjetoDevSuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.PrimeiroProjetoDevSuperior.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	

}
