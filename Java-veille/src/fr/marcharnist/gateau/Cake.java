package fr.marcharnist.gateau;

public class Cake extends Gateau {

	public Cake() {
		super();
		super.setSorteDeGateau("cake");
	}

	@Override
	public String toString() {
		return String.format("Cake [getClass()=%s, hashCode()=%s]", getClass(), hashCode());
	}
	
}
