package fr.marcharnist.test;
/**
 * @version 1.0
 * @author GCKEVL - Marc Harnist
 *
 * Exercices de veille en Java
 * 
 * Utilise la méthode String.format() de Java dans un accesseur
 * (getBeautifullString())
 */
public class Tools {

	//Déclaration des attributs
	private String message;
	private String beautifullString;

	//Constructeur
	public Tools(String message) {
		super();
		this.setMessage(message);
		this.setBeautifullString(message);
	}

	//Accesseurs et mutateurs
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	//Utilise String.format()
	public String getBeautifullString() {
		return String.format("\n\t//Beautifull\n\t%s", beautifullString);
	}

	public void setBeautifullString(String beautifullString) {
		this.beautifullString = beautifullString;
	}

	//Affiche les attributs de l'objet en chaîne de caractères
	@Override
	public String toString() {
		return String.format("Tools [message=%s, beautifullString=%s]", message, beautifullString);
	}
	
}
