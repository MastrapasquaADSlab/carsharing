package test1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Berlina berlina = new Berlina("aaaaaa");
		berlina.muovi();
		Utilitaria utilitaria = new Utilitaria(4, "bbbbbb");
		ArrayList<Vettura> vetture = new ArrayList<Vettura>();
	
		vetture.add(berlina);
		vetture.add(utilitaria);

//		for(int i=0;i<vetture.size();i++) {
//			vetture.get(i);
//		}
		
		for(Vettura v : vetture) {
			v.getTarga();
			v.getTipo();
		}
	}

}
