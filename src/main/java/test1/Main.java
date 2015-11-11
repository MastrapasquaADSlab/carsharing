package test1;

public class Main {

	public static void main(String[] args) {
		
		Automobile auto;
		Motore motoreelettrico = new Motore();      // assegno al nuovo oggetto di tipo motore  il tipo Motore
		//auto.motore = new Motore();               // motore è un attributo private (incapsulamento)
        Berlina berlina = new Berlina();
        Utilitaria utilitaria = new Utilitaria(); 
        berlina.muovi();
	}

}
