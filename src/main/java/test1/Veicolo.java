package test1;

public abstract class Veicolo {
	
	public Veicolo(int numRuote) {
		this.numRuote=numRuote;
	}
	
	public void muovi() {
		
	}
	
	public int getNumRuote() {
		return numRuote;
	}

	private int numRuote;
	private Motore motore;
}
