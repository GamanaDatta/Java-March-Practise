package OOP_Inheritance;


//final class -- can not be a parent class: preventing inheritance
public class Car extends Vehicle{
	
	final int speed = 100;

	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}
	
	@Override
	public void engine() {
		System.out.println("car -- engine");
	}
	
	//final method -- can not be overridden but can be inherited: prevent method overridding
	public final void restart() {
		System.out.println("car -- restart");
	}
	
	//static method: can not be overridden
	public static void billing() {
		System.out.println("car -- billing");
	}

	//private method: can not be overridden and inherited
	private void locking() {
		System.out.println("car -- locking");
	}
	
	public final void carLocking() {
		locking();
	}
	

}
