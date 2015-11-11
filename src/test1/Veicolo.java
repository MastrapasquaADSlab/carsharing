package test1;

public abstract class Veicolo { // una classe abstract non può essere istanziata ma solo estesa
	
	public Veicolo(int numRuote){
		this.numRuote = numRuote;
	}

	public abstract void siMuove();
	
	public int getNumRuote() {
		return numRuote;
	}

	private int numRuote;
	private Motore motore;

}
