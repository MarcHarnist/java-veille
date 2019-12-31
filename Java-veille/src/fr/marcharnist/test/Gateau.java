package fr.marcharnist.test;

import java.util.ArrayList;
import java.util.List;

public class Gateau {
	
	private List<String> ingredients; // Ne suffit pas! pour éviter un null, instancier ArrayList<>() de Java dans le constructeur
	
	
	//Constructeur
	Gateau(){
		ingredients = new ArrayList<String>();
		
	}

	public void ingredients(String un, String deux, String trois) {

		System.out.println(un);
		//Détaille la liste d'ingrédients
		ingredients.add(un);
		ingredients.add(deux);
		ingredients.add(trois);
		
	}


}
