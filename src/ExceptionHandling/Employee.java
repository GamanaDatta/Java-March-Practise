package ExceptionHandling;

public class Employee {
String name;
	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;// AE

			int num[] = new int[2];
			num[4] = 100;// AIOB

			Employee obj = new Employee();
			obj = null;
			obj.name = "Tom";// NPE

			System.out.println("hello world");

		}

		catch(Error e ) {
			System.out.println("error is coming...");
			e.printStackTrace();
		}

		catch (ArithmeticException e) {
			// reporting
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

		catch (NullPointerException e) {
			// reporting
			System.out.println("NPE is coming...");
			e.printStackTrace();
		}

		catch (Exception e) {
			System.out.println("some exception is coming...");
			e.printStackTrace();
		}

		catch (Throwable e) {
			System.out.println("some exception is coming...");
			e.printStackTrace();
		}

		System.out.println("Bye!!");

	}
}
