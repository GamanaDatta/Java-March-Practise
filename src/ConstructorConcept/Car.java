package ConstructorConcept;

public class Car {
	

	String name;
	int price;
	String licenseNumber;
	String model;
	static final int wheels = 4;

	// add one default const.. / hidden const.. by JVM only if you dont have any const.. in the class

	// AC:
	// name
	// name, price
	// name, licenseNumber
	// name, price, licenseNumber, model
	// no car info -- no need to create the object: no default const...

	public Car(String name) {
		this.name = name;
	}

	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Car(String name, String licenseNumber) {
		this.name = name;
		this.licenseNumber = licenseNumber;
	}

	public Car(String name, int price, String licenseNumber, String model) {
		this.name = name;
		this.price = price;
		this.licenseNumber = licenseNumber;
		this.model = model;
	}

	public static void main(String[] args) {

		Car c1 = new Car("Audi");
		Car c2 = new Car("BMW", 50);
		Car c3 = new Car("Honda", "8889899test");
		Car c4 = new Car("Alto", 2, "pppp9090", "x1");
		//Car c5 = new Car();
		
		System.out.println(c2.name + "  " + c2.price + " " + c2.licenseNumber + " " + c2.model);
		c2.licenseNumber = "bmw1212121";
		c2.model = "x5";
		System.out.println(c2.name + "  " + c2.price + " " + c2.licenseNumber + " " + c2.model + " "+ Car.wheels);

		
	}

}
