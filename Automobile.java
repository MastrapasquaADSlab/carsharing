package test1;

public interface Automobile {	// se al posto di class mettiamo interface
								// stiamo rappresentando un concetto astratto
								// non ancora ben definito
								// in un interfaccia si possono dare costanti
								// ma non si possono dare attributi

	/*public void muovi(){	// creo un metodo pubblico (per ora vuoto)
							// in questo modo e' definito
		
	}*/
	
	/*
	 	public void muovi();	// cosi' l'avrei solo dichiarato
	 							// se Automobile fosse un interface
	 							// ci interessa solo sapere che un auto si muove
	 							// senza sapere che significa
	*/
	
//	private Motore motore;	// creo attributo (variabile di istanza) di tipo Motore
							// abbiamo fatto un incapsulamento
							// da fuori Automobile non si puo' usare motore
	
	public String getTipo();	// dichiaro un metodo per informare che
								// un Automobile deve sapermi dire di che tipo e'
	
}
