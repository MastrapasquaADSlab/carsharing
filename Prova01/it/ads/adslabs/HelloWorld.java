package it.ads.adslabs;

public class HelloWorld {
	private static String printerName;
	
	public static void main(String[] args) {
			printerName="CIAO";
			System.out.println("Istanzio un Printer");
	
	InkJetPrinter p= new InkJetPrinter();
	System.out.println(p.getPrinterName());
	p.printHelloWorld();
	
	}
	
}
