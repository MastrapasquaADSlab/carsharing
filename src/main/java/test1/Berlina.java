package test1;

public class Berlina extends Veicolo	{
	
	public Berlina(String targa){
		
		super(targa);
	}
	
	public Berlina(int km , String targa) {
		
		super(km , targa);
	}


	public String getTipo() {
		return "Berlina";
	}
	
	public static final int NUM_RUOTE_BERLINA = 4;


}
