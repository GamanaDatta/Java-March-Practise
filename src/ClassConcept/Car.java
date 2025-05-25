package ClassConcept;

public class Car {

	// non static var, instance var
		String name;
		int price;
		String licenseNumber;
		String model;

		// class variable, static var
		static final int wheels = 4;// object will never hold any static variable

		public static void main(String[] args) {

			int i = 10;// local var
			// local var can not be static

			Car c1 = new Car();// object/instance
			c1.name = "BMW";
			c1.price = 40;
			c1.licenseNumber = "ABC123ride";
			c1.model = "x1";

			Car c2 = new Car();
			c2.name = "Audi";
			c2.price = 50;
			c2.licenseNumber = "FEG123ride";
			c2.model = "A6";

			Car c3 = new Car();
			c3.name = "Honda";
			c3.price = 20;
			c3.licenseNumber = "PQR123ride";
			c3.model = "Civic";

			// how to access static variable?
			// 1. access directly:
			System.out.println(wheels);// 4

			// 2. using the class name: recommended way
			System.out.println(Car.wheels);// 4

			// 3. using the object reference name?? -- not recommended--warning
			System.out.println(c1.wheels);// 4
					
			//
			System.out.println(c1.name + " " + c1.price + " " + c1.licenseNumber + " " + c1.model + " " + Car.wheels);
			System.out.println(c2.name + " " + c2.price + " " + c2.licenseNumber + " " + c2.model + " " + Car.wheels);
			System.out.println(c3.name + " " + c3.price + " " + c3.licenseNumber + " " + c3.model + " " + Car.wheels);

			

			
		}
	
}
