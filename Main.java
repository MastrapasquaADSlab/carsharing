package test1;

public class Main {

	public static void main(String[] args) {
		
		/*
		Automobile auto;				// nessun problema
		
		Motore elettrico = new Motore();	// nessun problema perche' sto creando
											// una varaibile di tipo Motore
		
		auto.motore = new Motore();		// ci sarebbe un errore perche'
										// motore e' privato in Automobile
		 */
		
		Berlina berlina = new Berlina();	// il Main accetta questo costrutto
											// grazie all'aggiunta del costruttore in Berlina
		berlina.muovi();
		
		Utilitaria utilitaria = new Utilitaria();
	}

}
