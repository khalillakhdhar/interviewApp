package com.interview.model.dto;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Data
public class TestDto {
	@NotBlank
	@Size(min = 3)
	private String titre;
	@NotBlank
	private String dateHeure;
	@NotBlank
	private String fichier;
	@NotBlank
	private String description;
	
	List<UtilisateurDto> utilisateurs;
}
