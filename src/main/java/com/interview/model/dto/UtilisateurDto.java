package com.interview.model.dto;

import java.util.List;

import com.interview.model.entity.Grades;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class UtilisateurDto {
	@NotBlank
	private String nom;
	@NotBlank
	private String prenom;
	@Positive
	@Min(value = 18)
	
	private int age;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	@Size(min = 6,max = 20)
	private String mdp;
	
	private Grades grade;
	private ProfileDto profile;
	private List<TestDto> tests;

}
