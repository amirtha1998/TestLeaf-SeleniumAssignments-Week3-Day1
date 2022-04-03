package week3.day1.org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size method called");
	}

	public static void main(String[] args) {
		Desktop dsk = new Desktop();
		dsk.ComputerModel();
		dsk.desktopSize();
	}

}
