package com.Nour.animals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nour.animals.entities.Animal;
import com.Nour.animals.entities.Proprietaire;
import com.Nour.animals.repos.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;

	@Override
	public Animal saveAnimal(Animal p) {
		return animalRepository.save(p);
	}

	@Override
	public Animal updateAnimal(Animal p) {
		return animalRepository.save(p);
	}

	@Override
	public void deleteAnimal(Animal p) {
		 animalRepository.delete(p);
		
	}

	@Override
	public void deleteAnimalById(Long id) {
		animalRepository.deleteById(id);

		
	}

	@Override
	public Animal getAnimal(Long id) {
		return animalRepository.findById(id).get();

	}

	@Override
	public List<Animal> getAllAnimals() {
		return animalRepository.findAll();

	}

	@Override
	public List<Animal> findByNomA(String nom) {
		return animalRepository.findByNomA(nom);
		}

	@Override
	public List<Animal> findByNomAContains(String nom) {
		
		return animalRepository.findByNomAContains(nom);
	}

	@Override
	public List<Animal> findByNomCouleur(String nom, String couleur) {
		return animalRepository.findByNomCouleur(nom, couleur);
	}

	@Override
	public List<Animal> findByProprietaire(Proprietaire proprietaire) {
		return animalRepository.findByProprietaire(proprietaire);
	}

	@Override
	public List<Animal> findByProprietaireNumP(Long id) {
		return animalRepository.findByProprietaireNumP(id);
	}

	@Override
	public List<Animal> findByOrderByNomAAsc() {
		return animalRepository.findByOrderByNomAAsc();
	}
	

}
