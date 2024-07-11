package entities;


public class Printer extends Device{

	public Printer(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prcessDoc(String doc) {
		System.out.println("Printer Processing" + doc );
	}
	
	
	public void print(String doc) {
		System.out.println("Printing"+doc);
	}

}
