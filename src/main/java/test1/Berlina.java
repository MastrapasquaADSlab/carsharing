package test1;

public class Berlina extends Veicolo
implements Automobile{             //implements si usa per le interfacce

	private int kmPercorsi=0;
	
	public static final int NUM_RUOTE_BERLINA=4;
	
	public Berlina(){
		super(NUM_RUOTE_BERLINA);                      //costruttore 1(num ruote costante)
	}
	
	public Berlina(int numRuote) {                     //costr+uttore 2 (num ruote passato come parametro)
		super(numRuote);
	}
	
	public void muovi() {                               //si deve implementare per forza tutti i metodi dalla classe implementata
		kmPercorsi++;
	}

	public String getTipo() {
		return "Berlina";
	}            

}
