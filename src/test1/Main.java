package test1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto;
		//auto.motore = new Motore(); //Errore poiché motore è privato, "incapsulato"
		Motore elettrico = new Motore();
		Berlina b = new Berlina();
		b.siMuove();
		Utilitaria u = new Utilitaria();
	}

}
