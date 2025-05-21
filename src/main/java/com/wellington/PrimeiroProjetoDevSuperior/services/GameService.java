package com.wellington.PrimeiroProjetoDevSuperior.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.PrimeiroProjetoDevSuperior.dto.GameMinDTO;
import com.wellington.PrimeiroProjetoDevSuperior.entities.Game;
import com.wellington.PrimeiroProjetoDevSuperior.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDTO> findAll(){
		
		List<Game> Result = gameRepository.findAll();
		return Result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}

}
