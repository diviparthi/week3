package week3.day2assignments;

public class Desktop implements HardWare, Software{

	public static void main(String[] args) {
Desktop objDesk = new Desktop();
objDesk.hardwareResources();
objDesk.softwareResources();
objDesk.systemResourceOwnMethod();
objDesk.commonResources();
objDesk.desktopModel();
	}

	public void softwareResources() {
		System.out.println("Printing software resources");
		
	}

	public void hardwareResources() {
		System.out.println("Printing Hardware resources");
	}
	
	public void systemResourceOwnMethod() {
		System.out.println("Printing Own method system resources");
	}

	public void commonResources() {
		System.out.println("Printing common method resources");
	}

	public void desktopModel() {
		System.out.println("Printing desktop model");
	}
}
