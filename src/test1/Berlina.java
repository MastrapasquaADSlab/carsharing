package test1;

public class Berlina extends Veicolo 
		implements Auto {  // per le interfacce si usa "implements"
	
	public Berlina() {
		super(NUM_RUOTE);
		// TODO Auto-generated constructor stub
	}

	public Berlina(int numRuote) {
		super(numRuote);
		// TODO Auto-generated constructor stub
	}

	//AVRANNO IL METODO siMuove(), da implementare

	
	public void siMuove() {};

	private int kmPercorsi = 0;

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Berlina";
	}
	
	public static final int NUM_RUOTE = 4;
	
}
