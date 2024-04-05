package com.interview.services;

import java.util.List;
import java.util.Optional;

import com.interview.model.dto.ProfileDto;
import com.interview.model.dto.UtilisateurDto;
import com.interview.model.entity.Profile;
import com.interview.model.entity.Utilisateur;

public interface UtilisateurService {
public UtilisateurDto addOneUtilisateur(UtilisateurDto utilisateurDto);
public List<UtilisateurDto> getAllUtilisateur();
public Optional<UtilisateurDto> getOneUtilisateur(long id);
public void deleteOneUtilisateur(long id);
public ProfileDto assignProfileToUtilisateur(long idUser,Profile ProfileDto);


}
