package com.Nour.animals;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Nour.animals.entities.Animal;
import com.Nour.animals.entities.Proprietaire;
import com.Nour.animals.repos.AnimalRepository;



@SpringBootTest
class AnimalsApplicationTests {

	@Autowired
	private AnimalRepository animalRepository;
	@Test
	public void testCreateAnimal() {
	Animal anim = new Animal("minouche","multicolore",new Date());
	animalRepository.save(anim);
	}
	
	 @Test
	 public void testFindProduit()
	 {
		 Animal p = animalRepository.findById(1L).get(); 
	 System.out.println(p);
	 }
	 @Test
	 public void testUpdateProduit()
	 {
		 Animal p = animalRepository.findById(1L).get();
	 p.setCouleur("noir");
	 animalRepository.save(p);
	 }
	 @Test
	 public void testDeleteProduit()
	 {
		 animalRepository.deleteById(1L);;
	 }
	  
	 @Test
	 public void testListerTousProduits()
	 {
	 List<Animal> anim = animalRepository.findAll();
	 for (Animal p : anim)
	 {
	 System.out.println(p);
	 }
	 }

	 @Test
	 public void testFindByNomA()
	 {
	 List<Animal> prods = animalRepository.findByNomA("minouche");
	 for (Animal p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testFindByNomAContains ()
	 {
	 List<Animal> prods=animalRepository.findByNomAContains("minouche");
	 for (Animal p : prods)
	 {
	 System.out.println(p);
	 } }
	 
	 @Test
	 public void testfindByNomCouleur()
	 {
	 List<Animal> prods = animalRepository.findByNomCouleur("minouche", "multicouleur");
	 for (Animal p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testfindByProprietaire()
	 {
	 Proprietaire cat = new Proprietaire();
	 cat.setNumP(1L);
	 List<Animal> prods = animalRepository.findByProprietaire(cat);
	 for (Animal p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void findByProprietairenumP()
	 {
	 List<Animal> prods = animalRepository.findByProprietaireNumP(2L);
	 for (Animal p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomAAsc()
	 {
	 List<Animal> prods = 
	 animalRepository.findByOrderByNomAAsc();
	 for (Animal p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 
	 
}
