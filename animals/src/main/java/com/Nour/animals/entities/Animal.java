package com.Nour.animals.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numA;
	private String nomA;
	private String couleur;
	private Date dateNais;
	@ManyToOne
	private Proprietaire proprietaire;
	
	
	public Animal(String nomA, String couleur, Date dateNais) {
		super();
		this.nomA = nomA;
		this.couleur = couleur;
		this.dateNais = dateNais;
	}
	public Animal() {
		super();
		
	}
	public Long getNumA() {
		return numA;
	}
	public void setNumA(Long numA) {
		this.numA = numA;
	}
	public String getNomA() {
		return nomA;
	}
	public void setNomA(String nomA) {
		this.nomA = nomA;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Date getDateNais() {
		return dateNais;
	}
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}
	
	
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}
	@Override
	public String toString() {
		return "Animal [numA=" + numA + ", nomA=" + nomA + ", couleur=" + couleur + ", dateNais=" + dateNais + "]";
	}
	
	

}
