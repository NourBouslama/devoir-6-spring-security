package com.Nour.animals.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Nour.animals.entities.Animal;
import com.Nour.animals.entities.Proprietaire;

@RepositoryRestResource(path = "rest")
public interface AnimalRepository extends JpaRepository<Animal, Long> {
	List<Animal> findByNomA(String nom);
	List<Animal> findByNomAContains(String nom); 
	
	/*@Query("select p from Animal p where p.nomA like %?1 and p.couleur like %?2")
	List<Animal> findByNomCouleur (String nom, String couleur);*/
	
	@Query("select p from Animal p where p.nomA like %:nom and p.couleur like %:couleur")
	List<Animal> findByNomCouleur (@Param("nom") String nom,@Param("couleur") String couleur);
	
	@Query("select p from Animal p where p.proprietaire = ?1")
	List<Animal> findByProprietaire (Proprietaire proprietaire);

	List<Animal> findByProprietaireNumP(Long num);
	
	List<Animal> findByOrderByNomAAsc();


}
