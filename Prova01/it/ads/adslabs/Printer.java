package it.ads.adslabs;

public class Printer {
	
	private String printerName;
	
	public Printer(String printerName) {
		this.setPrinterName(printerName);
		System.out.println(this.getPrinterName());
	}
	public Printer() {
		this.setPrinterName("Epson");
	}
	public void printHelloWorld(){
		System.out.println("Ciao Mondo da dentro Printer");
	}
	
	public void printHelloWorld(String passed){
		System.out.println("Ciao Mondo da dentro Printer"+passed);
	}
	
	public String getPrinterName() {
		return printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

}
