package Abstarct;

public class LoginPage  extends Page {
	int price = 50;
	
	
	public LoginPage() {
		System.out.println("LP -- default const...");
	}
	
	public LoginPage(int a) {
		System.out.println("LP -- one param const..."+ a);
	}
	
	public LoginPage(int a, int b) {
		System.out.println("LP -- two params const..."+ a+b);
	}
	

	@Override
	public void title() {
		System.out.println("LP -- title");
	}

	@Override
	public void url() {
		System.out.println("LP -- url");
	}

	@Override
	public void defaultLoadingTime() {
		System.out.println("Login page loading time 5 secs");
	}

	public void doLogin(String un, String pwd) {
		System.out.println("enter username " + un);
		System.out.println("enter password " + pwd);
		System.out.println("click on login button");
		System.out.println("user is logged in");
	}
	
	
	public static void footers() {
		System.out.println("Login page -- footers");
	}
}
