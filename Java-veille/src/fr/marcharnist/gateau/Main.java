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
		
		//Liste autant d'ingr�dients que l'on souhaite
		String ingredient_1 = "pomme";
		String ingredient_2 = "poire";
		String ingredient_3 = "chocolat";
		String ingredient_4 = "sucre";
		String ingredient_5 = "lait";
		
		//Ajoute les ingr�dients � la liste du 
		gateauN1.addIngredients(ingredient_1, ingredient_2, ingredient_3, ingredient_4, ingredient_5);
		
		//Affiche l'objet g�teau dans la console
		System.out.println("Affichage de l'objet cake (toString): ");
		System.out.println(gateauN1);
		
		//Afficher le contenu de la liste
		System.out.print("\nListe des ingr�dients: ");
		System.out.println(gateauN1.getIngredients());
		
		//Pense aux formes: tarte, cake, ... (Outils)
		System.out.print("\nSorte: ");
		System.out.println(gateauN1.getSorteDeGateau());
		
		//Affiche le nom du g�teau (en fonction d'un ou plusieurs ingr�dients)
		System.out.print("\nNom: ");
		System.out.println(gateauN1.getNomDuGateau());
	}
}
