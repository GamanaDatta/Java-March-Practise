package OOP_Inheritance;
//IS - A Relationship
public class BMW extends Car{
	
	int speed = 200;

	
	//method overriding: poly+Morphism: dynamic (runtime)
	//when we have a method in the parent class and the same method in the child class:
	//1. with the same name
	//2. with the same number of parameters (with the same sequence)
	//3. with the same type of return
	//use @Override annotation for overridden methods
	
	@Override
	public final void start() {
		System.out.println("BMW -- push start");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}
	
	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}
	
	//has - a relationship: Composition
	public void myLoading() {
		System.out.println("BMW loading method.....");
		Truck tr = new Truck();
		tr.loading();
	}
	
	//static -- individual
	//parent static --- child static --> method hiding
	public static void billing() {
		System.out.println("BMW -- billing");
	}
	
	
	
//	private void locking() {
//		System.out.println("BMW -- locking");
//	}
	
		

}