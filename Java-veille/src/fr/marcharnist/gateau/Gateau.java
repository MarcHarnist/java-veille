package fr.marcharnist.gateau;

import java.util.ArrayList;
import java.util.List;

public class Gateau {
	
	//Liste des attributs de l'objet
	private List<String> listeDesIngredients; // Ne suffit pas! pour éviter un null, instancier ArrayList<>() de Java dans le constructeur
	private String ingredientsToString;
	private String nomDuGateau;
	private String sorteDeGateau;

	//Constructeur
	Gateau(){
		
		//Instancie la classe ArrayList de Java
		listeDesIngredients = new ArrayList<String>();
		
		this.ingredientsToString = "";//efface "null" dans la chaîne
	}

	//Récupère les ingrédients et les ajoute à la liste des ingredients
	public void addIngredients(String ... args) {

		//Détaille la liste d'ingrédients
		for(String element : args) {
			
			//S'il y a du chocolat, le nom du cake sera "Cake au chocolat"
			if(element.equals("chocolat")) {
				setNomDuGateau("Gâteau au chocolat!");
			}
			else if(element.contentEquals("quetsch")) {
				setNomDuGateau("Gâteau au quetsch!");
			}
			//Ajoute l'élément à la chaîne de caractère
			ingredientsToString += element + ", ";
			
			//Ajoute l'élémnet à la liste des ingrédients
			listeDesIngredients.add(element);
		}
	}
	
	//Accesseurs et mutateurs
	public String getIngredients() {
		return ingredientsToString;
	}
	
	public String getIngredientsToString() {
		return ingredientsToString;
	}

	public void setIngredientsToString(String ingredientsToString) {
		this.ingredientsToString = ingredientsToString;
	}

	public void setIngredients(List<String> ingredients) {
		this.listeDesIngredients = ingredients;
	}

	public String getNomDuGateau() {
		return nomDuGateau;
	}

	public void setNomDuGateau(String nomDuGateau) {
		this.nomDuGateau = nomDuGateau;
	}

	public String getSorteDeGateau() {
		return sorteDeGateau;
	}

	public void setSorteDeGateau(String sorteDeGateau) {
		this.sorteDeGateau = sorteDeGateau;
	}
	//Retourne l'objet en chaîne de caractère
	@Override
	public String toString() {
		return String.format("Gateau [ingredients=%s, ingredientsToString=%s, nomDuGateau=%s, sorteDeGateau=%s]",
				listeDesIngredients, ingredientsToString, nomDuGateau, sorteDeGateau);
	}
}
