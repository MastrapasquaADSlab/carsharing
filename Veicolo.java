package test1;

public abstract class Veicolo {		// abstract serve per stabilire che la classe e' astratta
									// (per poter ereditare)
	
	public Veicolo(int numRuote) {	// creo un costruttore per questa classe astratta
		
		this.numRuote = numRuote;
		
	}
	
	public abstract void muovi();	// dichiaro un metodo astratto
	
	public int getNumRuote() {		// mi serve per poter esportare il valore di numRuote
		
		return numRuote;
	}

	private int numRuote;
	
	private Motore motore;

}
