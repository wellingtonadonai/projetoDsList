package com.wellington.PrimeiroProjetoDevSuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.PrimeiroProjetoDevSuperior.dto.GameListDTO;
import com.wellington.PrimeiroProjetoDevSuperior.dto.GameMinDTO;
import com.wellington.PrimeiroProjetoDevSuperior.services.GameListService;
import com.wellington.PrimeiroProjetoDevSuperior.services.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameservice;
	

	@GetMapping
	public List <GameListDTO> findAll(){
		List <GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{listId}/games")
	public List <GameMinDTO> findByList(@PathVariable Long listId){
		List <GameMinDTO> result = gameservice.findByList(listId);
		return result;
		
	}
	
	

}
