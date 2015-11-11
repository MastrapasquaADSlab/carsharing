package test1;

public class Berlina extends Vettura {

	public Berlina(String targa) {
		super(NUM_RUOTE_BERLINA, targa);
	}
	
	public Berlina(int numRuote, String targa) {
		super(numRuote, targa);
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
