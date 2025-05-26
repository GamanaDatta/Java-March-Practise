package Keywords;

public class Car {
	
	int speed = 100;
	int price = 800;

	
	public Car() {
		this(500, 1000);
		System.out.println("car -- default const...");
	}
	
	public Car(int i) {
		System.out.println("car -- param const..."+ i);
	}
	
	public Car(int i, int j) {
		System.out.println("car -- two param const..."+ (i+j));
	}
	
	
	public void start() {
		System.out.println("car -- start");
	}
	
	
	public void stop() {
		System.out.println("car -- stop");

	}

}
