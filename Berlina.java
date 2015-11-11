package test1;

public class Berlina extends Veicolo	// extends serve per estendere Veicolo
	implements Automobile {				// implements serve per ereditare da Automobile
	
	public Berlina() {		// altro costruttore
		
		super(NUM_RUOTE_BERLINA);		// si riferisce all'attributo sul numero di ruote
										// della sua classe padre Veicolo
		
	}
	
	public Berlina(int numRuote) {		// aggiunta (automatica) del costruttore
										// riferito all'extends
		
		super(numRuote);
		
	}

	
	public void muovi() {					// il metodo e' stato ereditato da Automobile
											// questa volta sara' definito
		
		kmPercorsi++;
		
	}
	
	public static final int NUM_RUOTE_BERLINA = 4;	// defiinisco una costante
	
	private int kmPercorsi = 0;		// creo una variabile di istanza inizializzata

	public String getTipo() {		// definisco il metodo precedentemente dichiarato in Automobile
		
		return "Berlina";			
	}

}
