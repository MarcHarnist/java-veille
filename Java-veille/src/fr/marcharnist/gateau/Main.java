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
		Gateau cake = new Cake();
		
		//Affiche la sorte de gâteau
		System.out.print("Sorte de gâteau:");
		System.out.println(cake.getSorteDeGateau());
		
		String ingredient_1 = "pomme";
		String ingredient_2 = "poire";
		String ingredient_3 = "chocolat";
		cake.ingredients(ingredient_1, ingredient_2, ingredient_3);
		
		//Affiche l'objet gâteau dans la console
		System.out.println();
		System.out.println(cake);
		
		//Afficher le contenu de la liste
		System.out.println();
		System.out.println("Liste des ingrédients: " + cake.getIngredients());
		
		//Crée une condition: si chocolat est dans la liste des ingrédients: afficher: c'est un gâteau au chocolat
		System.out.println();
		System.out.println(cake.getSorteDeGateau());
		
		//Pense aux formes: tarte, cake, ... (Outils)
		System.out.println();
		System.out.println("Sorte de gâteau: " + cake.getSorteDeGateau());
	}
}
