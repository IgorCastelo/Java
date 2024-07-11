package entities;

public class Scanner extends Device{

	public Scanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void prcessDoc(String doc) {
		System.out.println("Sacanner Processing" + doc );
	}
	
	
	public String scan() {
		return "scanned content";
	}

}
