package ExceptionHandling;

public class Utility {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// throw -- create ur own exception
		// throwing the exception deliberately

		String data = null;

		if (data == null) {
			System.out.println("data is not present...");

			throw new RuntimeException("===data is null==");

		}

		System.out.println("fill the registration form");

	}

}