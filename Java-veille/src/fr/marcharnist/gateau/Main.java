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

	public static void main(String[] arguments) {
		
		//Crée un objet avec ses méthode
		Gateau gateauN1 = new Cake();
		
		//Liste autant d'ingrédients que l'on souhaite
		String ingredient_1 = "pomme";
		String ingredient_2 = "poire";
		String ingredient_3 = "chocolat";
		String ingredient_4 = "sucre";
		String ingredient_5 = "lait";
		
		//Ajoute les ingrédients à la liste du 
		gateauN1.addIngredients(ingredient_1, ingredient_2, ingredient_3, ingredient_4, ingredient_5);
		
		//Affiche l'objet gâteau dans la console
		System.out.println("Affichage de l'objet cake (toString): ");
		System.out.println(gateauN1);
		
		//Afficher le contenu de la liste
		System.out.print("\nListe des ingrédients: ");
		System.out.println(gateauN1.getIngredients());
		
		//Pense aux formes: tarte, cake, ... (Outils)
		System.out.print("\nSorte: ");
		System.out.println(gateauN1.getSorteDeGateau());
		
		//Affiche le nom du gâteau (en fonction d'un ou plusieurs ingrédients)
		System.out.print("\nNom: ");
		System.out.println(gateauN1.getNomDuGateau());
		
		//GATEAU N°2
		Gateau gateauN2 = new Tarte();
		
		//Liste autant d'ingrédients que l'on souhaite
		String ingredient_100 = "quetsch";
		String ingredient_101 = "sucre";

		//Ajoute les ingrédients à la liste du 
		gateauN2.addIngredients(ingredient_100, ingredient_101);
		
		//Affiche l'objet gâteau dans la console
		System.out.println("\nAffichage de l'objet tarte (toString): ");
		System.out.println(gateauN2);
		
		//Afficher le contenu de la liste
		System.out.print("\nListe des ingrédients: ");
		System.out.println(gateauN2.getIngredients());
		
		//Pense aux formes: tarte, cake, ... (Outils)
		System.out.print("\nSorte: ");
		System.out.println(gateauN2.getSorteDeGateau());
		
		//Affiche le nom du gâteau (en fonction d'un ou plusieurs ingrédients)
		System.out.print("\nNom: ");
		System.out.println(gateauN2.getNomDuGateau());
	}
}
