package com.wellington.PrimeiroProjetoDevSuperior.dto;

import com.wellington.PrimeiroProjetoDevSuperior.entities.Game;
import com.wellington.PrimeiroProjetoDevSuperior.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;	
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entity) {
		
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.imgUrl = projection.getimgUrl();
		this.shortDescription = projection.getshortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
