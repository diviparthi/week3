package week3.day1.org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Size of the desktop is 5000");

	}
	public static void main(String[] args) {
		Desktop objDesk = new Desktop();
		objDesk.desktopSize();
		objDesk.computerModel();
	}
}
