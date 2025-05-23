package com.wellington.PrimeiroProjetoDevSuperior.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellington.PrimeiroProjetoDevSuperior.dto.GameListDTO;
import com.wellington.PrimeiroProjetoDevSuperior.entities.GameList;
import com.wellington.PrimeiroProjetoDevSuperior.repositories.GameListRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> Result = gameListRepository.findAll();
		return Result.stream().map(x -> new GameListDTO(x)).toList();
		
		
	}

}
