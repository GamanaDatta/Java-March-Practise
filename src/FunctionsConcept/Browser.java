package FunctionsConcept;

public class Browser {
	//AC:WAF:
	//name: launchBrowser
	//input param: String browserName
	//logic: launch the browser
	//return: boolean: true
	//if browser is not found: return false
	
	public boolean launchBrowser(String browserName) {
		System.out.println("trying to launch browser: "+ browserName);
		boolean isLaunched = true;
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched...");
			break;
		case "firefox":
			System.out.println("firefox is launched...");
			break;
		case "edge":
			System.out.println("edge is launched...");
			break;
		case "safari":
			System.out.println("safari is launched...");
			break;
		default:
			System.out.println("browser is not found...plz pass the right browser...");
			isLaunched = false;
			break;
		}
		
		return isLaunched;
	}
	
	
	public boolean launchMyBrowser(String browserName) {
		System.out.println("trying to launch browser: "+ browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launched...");
			return true;
		case "firefox":
			System.out.println("firefox is launched...");
			return true;
		case "edge":
			System.out.println("edge is launched...");
			return true;
		case "safari":
			System.out.println("safari is launched...");
			return true;
		default:
			System.out.println("browser is not found...plz pass the right browser...");
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {

		Browser obj = new Browser();
		boolean flag = obj.launchBrowser("CHROME");//call by value
		System.out.println(flag);

		if(flag) {
			System.out.println("enter the app url...");
		}
		System.out.println("--------");
		
		boolean t = obj.launchMyBrowser("opera");
		System.out.println(t);
		if(t) {
			System.out.println("enter the app url...");
		}
		
		
		
		
		
		
	}
}
