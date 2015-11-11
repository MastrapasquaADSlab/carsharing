package test1;

public abstract class Veicolo implements Spostatore {
	
	private int tachimetro;
	private String targa;
	
	
	
	public Veicolo(int km , String targa) {
		this.tachimetro = km;
		this.targa = targa;
	}
    
	
	public Veicolo(String targa) {
		this.tachimetro = CANCELLO;
		this.targa = targa;
	}
	
	
    public void muovi(int spostamento) {
    	
    	this.setKm(this.tachimetro + spostamento);
    	
    }

    private int getKm() {
		return tachimetro;
	}
    
	public int getKmPercorsi(String targa) {
		return this.getKm();
	}

	public void setKm(int km) {
		this.tachimetro = km;
	}

	public String getTarga() {
		return targa;
	}

	private static final int CANCELLO=0;
	
}
