package fr.marcharnist.test;

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

		//Instancie la classe Demo qui h�rite de la classe Tools
		//La classe Tools propose la gestion de l'affichage des messages
		Demo demo_1 = new Demo("Hello world!");
		System.out.println(demo_1);
		System.out.println(demo_1.getBeautifullString());
		
		//Cr�e un objet avec ses m�thode
		Gateau gateau = new Gateau();
		String ingredient_1 = "pomme";
		String ingredient_2 = "poire";
		String ingredient_3 = "chocolat";
		gateau.ingredients(ingredient_1, ingredient_2, ingredient_3);
		
		//Affiche l'objet gateau dans la console
		System.out.println(gateau);
		
		//Afficher le contenu de la liste
		
		//Cr�e une condition: si chocolat est dans la liste des ingr�dients: afficher: c'est un g�teau au chocolat
		
		
	}
}



