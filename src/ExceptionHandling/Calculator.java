package ExceptionHandling;

public class Calculator {
	public static void div(int a, int b) {
		try {
			int c = a / b;
			System.out.println(c);
		} 
		catch (ArithmeticException e) {
			//reporting of issue, error, messg, logs, screenshot
			System.out.println("b is zero, hence AE is coming..plz pass the non zero value for b");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		div(10, 2);
		div(10, 0);

		System.out.println("bye!!");
	}

}
