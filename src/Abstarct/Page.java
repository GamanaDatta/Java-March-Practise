package Abstarct;
//can not create the object of abstract class
//abstract class can have const.. and it will be called when you create the object of the child class

public abstract class Page {

	int price = 10;

	// abstract + non abstract methods

	// only abstract methods -- 100% abstraction
	// no abstract method -- 0% abstraction
	// abstract + non abstract methods -- partial abstraction

	// 0 to 100% abstraction

	public Page() {
		System.out.println("Page -- default const...");
	}
	
	public Page(int a) {
		System.out.println("Page -- one param const..."+ a);
	}
	
	public Page(int a, int b) {
		System.out.println("Page -- one param const..."+ a+b);
	}
	

	public abstract void title();

	public abstract void url();

	public final void displayLogo() {
		System.out.println("page -- logo");
	}

	public void defaultLoadingTime() {
		System.out.println("page loading time 10 secs");
	}

	public static void footers() {
		System.out.println("page -- footers");
	}

}
