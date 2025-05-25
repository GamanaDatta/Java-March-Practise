package StaticMethod;

public class A {
	
	public static void main(String[] a) {
		System.out.println("A -- main");
		
		//calling B class main method
		
		String test[] = {"chrome", "firefox", "safari"};
		String rest[] = {"win", "linux", "mac"};

		B.main(test);
		
		B.main(test, rest);

	}
}
