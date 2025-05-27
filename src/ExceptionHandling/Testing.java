package ExceptionHandling;

public class Testing {
	// App methods
	public void m1() {
		System.out.println("m1 method");
		m2();		
	}

	public void m2() {
		System.out.println("m2 method");
		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	// 2 yrs back -- bank method
	public void m3() throws ArithmeticException, NullPointerException {
		System.out.println("m3 method");
		int i = 9 / 0;// AE
	}

	// user -- caller method
	public static void main(String[] args) {
		Testing obj = new Testing();

		obj.m1();

		System.out.println("Bye!!!");

	}
}
