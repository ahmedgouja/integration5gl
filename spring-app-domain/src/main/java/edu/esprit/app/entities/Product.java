package edu.esprit.app.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product implements Serializable {
	@Id
	private int id;
	private String nom;
	private float prix;
	
	
	
	public Product() {
		
	}
	public Product(int id, String nom, float prix) {
		//super();
		this.id = id;
		this.nom = nom;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	
	
	
	
	

}
