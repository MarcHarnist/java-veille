package fr.marcharnist.test;

import java.util.ArrayList;
import java.util.List;

public class Gateau {
	
	private List<String> ingredients; // Ne suffit pas! pour �viter un null, instancier ArrayList<>() de Java dans le constructeur
	
	
	//Constructeur
	Gateau(){
		ingredients = new ArrayList<String>();
		
	}

	public void ingredients(String un, String deux, String trois) {

		System.out.println(un);
		//D�taille la liste d'ingr�dients
		ingredients.add(un);
		ingredients.add(deux);
		ingredients.add(trois);
		
	}


}
