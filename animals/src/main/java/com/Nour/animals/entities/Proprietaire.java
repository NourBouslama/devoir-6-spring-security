package com.Nour.animals.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Proprietaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numP;
	private String nomP;
	private int telf;
	
	@JsonIgnore
	@OneToMany(mappedBy = "proprietaire")
	private List<Animal> animals;

	//public Proprietaire() {}

	public Proprietaire(String nomP, int telf, List<Animal> animals) {
		super();
		this.nomP = nomP;
		this.telf = telf;
		this.animals = animals;
	}

	public Long getNumP() {
		return numP;
	}

	public void setNumP(Long numP) {
		this.numP = numP;
	}

	public String getNomP() {
		return nomP;
	}

	public void setNomP(String nomP) {
		this.nomP = nomP;
	}

	public int getTelf() {
		return telf;
	}

	public void setTelf(int telf) {
		this.telf = telf;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	
	

}
