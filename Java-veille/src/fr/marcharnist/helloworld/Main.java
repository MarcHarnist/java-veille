package fr.marcharnist.helloworld;

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
		
	}
}



