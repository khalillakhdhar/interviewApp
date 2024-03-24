package com.interview.model.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Utilisateur  extends BaseEntity{

@Column(nullable = false)
private String nom;
@Column(nullable = false)
private String prenom;
@Column(nullable = false,unique = true)
private String email;
@Column(nullable = false)
private String mdp;
@Enumerated(EnumType.STRING)
private Grades grade;
@OneToOne(mappedBy = "utilisateur")
private Profile profile;
@ManyToMany(cascade = {
		CascadeType.PERSIST,
		CascadeType.MERGE
})
private List<Test> tests;
}