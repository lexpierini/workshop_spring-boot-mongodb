package com.example.aula338.dto;

import java.io.Serializable;

import com.example.aula338.domain.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
	}
	
	public UserDTO(User obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

/*
 
DTO (Data Transfer Object): c'est un objet qui a pour rôle de charger les données des entités d'une manière simple,
et peut même "projeter" seulement certaines données de l'entité d'origine.

Avantages:

- Optimiser le trafic (voyager moins de données);
- Évitez d'exposer des données d'intérêt exclusif au système (par exemple:
  mots de passe, données d'audit telles que la date de création et la date de mise à jour de l'objet, etc.);
- Personnaliser les objets trafiqués en fonction du besoin de chaque demande
  (par exemple: pour changer un produit, vous avez besoin des données A, B et C; déjà pour lister les produits,
  j'ai besoin des données A, B et de la catégorie de chaque produit, etc.).

*/
