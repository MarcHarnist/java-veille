package fr.marcharnist.gateau;

public class Cake extends Gateau {

	public Cake() {
		super();
		this.setSorteDeGateau("cake");
	}

	@Override
	public String toString() {
		return String.format("Cake [getClass()=%s, hashCode()=%s]", getClass(), hashCode());
	}
	
}
