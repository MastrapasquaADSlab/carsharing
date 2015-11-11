package test1;

public abstract class Veicolo {
	
	public Veicolo(int numRuote, String targa) {
		this.numRuote=numRuote;
		this.targa=targa;
	}
	
	public void muovi() {
		
	}
	
	public int getNumRuote() {
		return numRuote;
	}

	public String getTarga() {
		return targa;
	}

	private int numRuote;
	private Motore motore;
	private String targa;
}
