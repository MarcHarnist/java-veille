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
		Gateau gateauN1 = new Cake();
		
		String ingredient_1 = "pomme";
		String ingredient_2 = "poire";
		String ingredient_3 = "chocolat";
		gateauN1.ingredients(ingredient_1, ingredient_2, ingredient_3);
		
		//Affiche l'objet g�teau dans la console
		System.out.print("cake : ");
		System.out.println(gateauN1);
		
		//Afficher le contenu de la liste
		System.out.println();
		System.out.println("Liste des ingr�dients: " + gateauN1.getIngredients());
		
		//Cr�e une condition: si chocolat est dans la liste des ingr�dients: afficher: c'est un g�teau au chocolat
		System.out.println();
		System.out.print("Sorte de g�teau: ");
		System.out.println(gateauN1.getSorteDeGateau());
		
		//Pense aux formes: tarte, cake, ... (Outils)
		System.out.println();
		System.out.println("Nom du g�teau: " + gateauN1.getNomDuGateau());
	}
}
