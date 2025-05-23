package com.wellington.PrimeiroProjetoDevSuperior.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.PrimeiroProjetoDevSuperior.dto.GameListDTO;
import com.wellington.PrimeiroProjetoDevSuperior.dto.GameMinDTO;
import com.wellington.PrimeiroProjetoDevSuperior.services.GameListService;

@RestController
@RequestMapping("/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	

	@GetMapping
	public List <GameListDTO> findAll(){
		List <GameListDTO> result = gameListService.findAll();
		return result;
		
	}
	
	

}
