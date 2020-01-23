package fr.marcharnist.gateau;

import java.util.ArrayList;
import java.util.List;

public class Gateau {
	
	//Liste des attributs de l'objet
	private List<String> listeDesIngredients; // Ne suffit pas! pour �viter un null, instancier ArrayList<>() de Java dans le constructeur
	private String ingredientsToString;
	private String nomDuGateau;
	private String sorteDeGateau;

	//Constructeur
	Gateau(){
		
		//Instancie la classe ArrayList de Java
		listeDesIngredients = new ArrayList<String>();
		
		this.ingredientsToString = "";//efface "null" dans la cha�ne
	}

	//R�cup�re les ingr�dients et les ajoute � la liste des ingredients
	public void addIngredients(String ... args) {

		//D�taille la liste d'ingr�dients
		for(String element : args) {
			
			//S'il y a du chocolat, le nom du cake sera "Cake au chocolat"
			if(element.equals("chocolat")) {
				setNomDuGateau("G�teau au chocolat!");
			}
			else if(element.contentEquals("quetsch")) {
				setNomDuGateau("G�teau au quetsch!");
			}
			//Ajoute l'�l�ment � la cha�ne de caract�re
			ingredientsToString += element + ", ";
			
			//Ajoute l'�l�mnet � la liste des ingr�dients
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
	//Retourne l'objet en cha�ne de caract�re
	@Override
	public String toString() {
		return String.format("Gateau [ingredients=%s, ingredientsToString=%s, nomDuGateau=%s, sorteDeGateau=%s]",
				listeDesIngredients, ingredientsToString, nomDuGateau, sorteDeGateau);
	}
}
