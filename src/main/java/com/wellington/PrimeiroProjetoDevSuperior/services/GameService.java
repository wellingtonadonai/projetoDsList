package com.wellington.PrimeiroProjetoDevSuperior.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellington.PrimeiroProjetoDevSuperior.dto.GameDTO;
import com.wellington.PrimeiroProjetoDevSuperior.dto.GameMinDTO;
import com.wellington.PrimeiroProjetoDevSuperior.entities.Game;
import com.wellington.PrimeiroProjetoDevSuperior.projections.GameMinProjection;
import com.wellington.PrimeiroProjetoDevSuperior.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long Id) {
		Game result = gameRepository.findById(Id).get();
		return new GameDTO(result);
		 
		}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> Result = gameRepository.findAll();
		return Result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List <GameMinProjection> Result = gameRepository.searchByList(listId);
		return Result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}

}
