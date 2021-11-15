package com.Nour.animals.service;

import java.util.List;

import com.Nour.animals.entities.Animal;
import com.Nour.animals.entities.Proprietaire;

public interface AnimalService {
	Animal saveAnimal(Animal p);
	Animal updateAnimal(Animal p);
	void deleteAnimal(Animal p);
	 void deleteAnimalById(Long id);
	 Animal getAnimal(Long id);
	List<Animal> getAllAnimals();

	List<Animal> findByNomA(String nom);
	List<Animal> findByNomAContains(String nom);
	List<Animal> findByNomCouleur (String nom, String couleur);
	List<Animal> findByProprietaire (Proprietaire proprietaire);
	List<Animal> findByProprietaireNumP(Long id);
	List<Animal> findByOrderByNomAAsc();
	//List<Animal> trierProduitsNomsPrix();


}
