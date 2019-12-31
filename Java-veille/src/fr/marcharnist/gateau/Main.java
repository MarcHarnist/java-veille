package fr.marcharnist.gateau;

/**
 * @version 1.0
 * @author GCKEVL - Marc Harnist
 *
 * Exercices de veille en Java
 * 
 * H�ritages
 * Instanciation d'une classe
 * 
 */

public class Main {

	public static void main(String[] args) {

		//Cr�e un objet avec ses m�thode
		Gateau cake = new Cake();
		
		//Affiche la sorte de g�teau
		System.out.print("Sorte de g�teau:");
		System.out.println(cake.getSorteDeGateau());
		
		String ingredient_1 = "pomme";
		String ingredient_2 = "poire";
		String ingredient_3 = "chocolat";
		cake.ingredients(ingredient_1, ingredient_2, ingredient_3);
		
		//Affiche l'objet g�teau dans la console
		System.out.println();
		System.out.println(cake);
		
		//Afficher le contenu de la liste
		System.out.println();
		System.out.println("Liste des ingr�dients: " + cake.getIngredients());
		
		//Cr�e une condition: si chocolat est dans la liste des ingr�dients: afficher: c'est un g�teau au chocolat
		System.out.println();
		System.out.println(cake.getSorteDeGateau());
		
		//Pense aux formes: tarte, cake, ... (Outils)
		System.out.println();
		System.out.println("Sorte de g�teau: " + cake.getSorteDeGateau());
	}
}
