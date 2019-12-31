package fr.marcharnist.gateau;

/**
 * @version 1.0
 * @author GCKEVL - Marc Harnist
 *
 * Exercices de veille en Java
 * 
 * Héritages
 * Instanciation d'une classe
 * 
 */

public class Main {

	public static void main(String[] args) {

		//Crée un objet avec ses méthode
		Gateau gateauN1 = new Cake();
		
		String ingredient_1 = "pomme";
		String ingredient_2 = "poire";
		String ingredient_3 = "chocolat";
		gateauN1.ingredients(ingredient_1, ingredient_2, ingredient_3);
		
		//Affiche l'objet gâteau dans la console
		System.out.print("cake : ");
		System.out.println(gateauN1);
		
		//Afficher le contenu de la liste
		System.out.println();
		System.out.println("Liste des ingrédients: " + gateauN1.getIngredients());
		
		//Pense aux formes: tarte, cake, ... (Outils)
		System.out.println();
		System.out.print("Sorte de gâteau: ");
		System.out.println(gateauN1.getSorteDeGateau());
		
		//Affiche le nom du gâteau (en fonction d'un ou plusieurs ingrédients)
		System.out.println();
		System.out.println("Nom du gâteau: " + gateauN1.getNomDuGateau());
	}
}
