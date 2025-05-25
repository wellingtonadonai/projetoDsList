package com.wellington.PrimeiroProjetoDevSuperior.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellington.PrimeiroProjetoDevSuperior.dto.GameListDTO;
import com.wellington.PrimeiroProjetoDevSuperior.entities.GameList;
import com.wellington.PrimeiroProjetoDevSuperior.projections.GameMinProjection;
import com.wellington.PrimeiroProjetoDevSuperior.repositories.GameListRepository;
import com.wellington.PrimeiroProjetoDevSuperior.repositories.GameRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> Result = gameListRepository.findAll();
		return Result.stream().map(x -> new GameListDTO(x)).toList();
		
		
	}
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		List <GameMinProjection> list = gameRepository.searchByList(listId);
		
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex: sourceIndex;
		
		for(int i = min; i <= max; i++) {
			
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
			
		}
	}

}
