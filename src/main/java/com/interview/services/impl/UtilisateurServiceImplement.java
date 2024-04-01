package com.interview.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.interview.model.dto.UtilisateurDto;
import com.interview.model.entity.Profile;
import com.interview.model.entity.Utilisateur;
import com.interview.repositories.ProfilRepository;
import com.interview.repositories.UtilisateurRepository;
import com.interview.services.UtilisateurService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UtilisateurServiceImplement implements UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;
	private final ProfilRepository profilRepository;
	
	
	
	@Override
	public Utilisateur addOneUtilisateur(Utilisateur utilisateurDto) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateurDto);
	}

	@Override
	public List<Utilisateur> getAllUtilisateur() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Optional<Utilisateur> getOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findById(id);
	}

	@Override
	public void deleteOneUtilisateur(long id) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(id);

	}

	@Override
	public Profile assignProfileToUtilisateur(long idUser, Profile profile) {
		// TODO Auto-generated method stub
		if(utilisateurRepository.existsById(idUser))
		{
			Utilisateur utilisateur=utilisateurRepository.findById(idUser).get();
			utilisateur.setProfile(profile);
			utilisateurRepository.save(utilisateur);
			return profile;
		}
			
		
		
		return null;
	}

}
