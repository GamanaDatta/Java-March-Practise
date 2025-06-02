package ExceptionHandling;

public class Factory {
public static void main(String[] args) {
		
		String browser = "opera";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		default:
			System.out.println("plz pass the right browser....");
			throw new MyException("===INVALID BROWSER===");
		}
		
		System.out.println("enter the url....");//driver.get();
		System.out.println("find the element");
		System.out.println("close browser");
		
		
		
		

	}

}