package fr.marcharnist.test;

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

		//Instancie la classe Demo qui hérite de la classe Tools
		//La classe Tools propose la gestion de l'affichage des messages
		Demo demo_1 = new Demo("Hello world!");
		System.out.println(demo_1);
		System.out.println(demo_1.getBeautifullString());
		
		//Crée un objet avec ses méthode
		Gateau gateau = new Gateau();
		String ingredient_1 = "pomme";
		String ingredient_2 = "poire";
		String ingredient_3 = "chocolat";
		gateau.ingredients(ingredient_1, ingredient_2, ingredient_3);
		
		//Affiche l'objet gateau dans la console
		System.out.println(gateau);
		
		//Afficher le contenu de la liste
		
		//Crée une condition: si chocolat est dans la liste des ingrédients: afficher: c'est un gâteau au chocolat
		
		
	}
}



