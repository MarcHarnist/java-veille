package fr.marcharnist.gateau;

import java.util.ArrayList;
import java.util.List;

public class Gateau {
	
	private List<String> ingredients; // Ne suffit pas! pour éviter un null, instancier ArrayList<>() de Java dans le constructeur
	private String ingredientsToString;
	private String nomDuGateau;
	private String sorteDeGateau;

	//Constructeur
	Gateau(){
		ingredients = new ArrayList<String>();
		
	}

	public void ingredients(String un, String deux, String trois) {

		//Détaille la liste d'ingrédients
		ingredients.add(un);
		ingredients.add(deux);
		ingredients.add(trois);
		
	}
	
	public String getIngredients() {
		
		//Déclaration de la variable de retour en nulle
		this.ingredientsToString = "";
				
		//Boucle et enregistre les éléments de la liste dans "ingredients"
		for(String element : ingredients) {

			//S'il y a du chocolat, le nom du cake sera "Cake au chocolat"
			if(element.equals("chocolat")) {
				setNomDuGateau("Gâteau au chocolat!");
			}
			ingredientsToString += element + ", ";
			
		}
		
		//Retourne la variable
		return ingredientsToString;
	}
	
	public String getIngredientsToString() {
		return ingredientsToString;
	}

	public void setIngredientsToString(String ingredientsToString) {
		this.ingredientsToString = ingredientsToString;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
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


}
