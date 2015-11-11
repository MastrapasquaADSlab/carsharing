package test1;

public abstract class Veicolo {                // è una classe astratta
	
	private int numRuote;
	
	public Veicolo(int numRuote){
		this.numRuote = numRuote;
	}
	
	public abstract void muovi();

	public int getNumRuote() {
		return numRuote;
	}

	public void setNumRuote(int numRuote) {
		this.numRuote = numRuote;
	}
	
}
