package ExceptionHandling;

public class Customer {
	
		@SuppressWarnings("finally")
		public static int getMarks(String name) {

			System.out.println("customer name ---" + name);
			

			if (name.equals("shubham")) {
				try {
					//System.exit(1);//shut down the JVM
					int i = 9 / 0;
					System.exit(1);
					return 60;
				} 
				catch (ArithmeticException e) {
					System.out.println("AE is coming...");
					e.printStackTrace();
					return 70;
				}
				finally {
						System.out.println("finally block...");
					//System.exit(1);//shut down the JVM
					return 100;
				}

				//return 90;
			}

			else if (name.equals("rahul")) {
				return 95;
			}

			else if (name.equals("naveen")) {
				return 0;
			}

			else {
				System.out.println("customer not found,..");
				return -1;
			}

		}

		public static void main(String[] args) {
			int m1 = getMarks("shubham");
			System.out.println(m1);
		}

	}