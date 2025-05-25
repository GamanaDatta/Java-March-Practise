package Abstarct;

public class WebTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.defaultLoadingTime();
		lp.doLogin("admin", "admin123");
		Page.footers();
		System.out.println(lp.price);
		
		System.out.println("-----------");

		//top casting:
		//child class object can be referred by parent abstract class ref variable
//		Page p = new LoginPage();
//		p.title();
//		p.url();
//		p.defaultLoadingTime();
//		p.displayLogo();
//		System.out.println(p.price);
		
		//down casting
		//new Page();//NA
		
		
		
		
	}
}
