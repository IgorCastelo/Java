package entities;

public class Device {
	private String serialNumber;

	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public void prcessDoc(String doc) {
		System.out.println("Device Processing" + doc );
	}
}
