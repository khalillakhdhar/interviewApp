package com.interview.services;

import java.util.List;
import java.util.Optional;

import com.interview.model.dto.UtilisateurDto;
import com.interview.model.entity.Profile;
import com.interview.model.entity.Utilisateur;

public interface UtilisateurService {
public Utilisateur addOneUtilisateur(Utilisateur utilisateurDto);
public List<Utilisateur> getAllUtilisateur();
public Optional<Utilisateur> getOneUtilisateur(long id);
public void deleteOneUtilisateur(long id);
public Profile assignProfileToUtilisateur(long idUser,Profile profile);


}
