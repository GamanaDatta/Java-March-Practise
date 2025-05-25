package Java_Sessions;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";

		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("plz pass the right browser...");
			break;
			
	}

}
}