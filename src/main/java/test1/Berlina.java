package test1;

public class Berlina extends Veicolo
	implements Automobile {

	public Berlina() {
		super(NUM_RUOTE_BERLINA);
	}
	
	public Berlina(int numRuote) {
		super(numRuote);
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		// TODO Auto-generated method stub
		return "Berlina";
	}
	
	public void muovi() {
		
		kmPercorsi++;
	}

	public static final int NUM_RUOTE_BERLINA=4;
	
	private int kmPercorsi=0;

}
