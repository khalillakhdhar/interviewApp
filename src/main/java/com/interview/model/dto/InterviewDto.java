package com.interview.model.dto;

import com.interview.model.entity.Offre;
import com.interview.model.entity.Utilisateur;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class InterviewDto {
	@NotBlank
	private String dateHeure;
	@NotBlank
	private String responsable;
	@NotBlank
	private String url;
	@NotBlank
	private Offre offre;
	@NotBlank
	private Utilisateur participant;
}
