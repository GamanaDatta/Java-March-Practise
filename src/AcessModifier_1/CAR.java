package AcessModifier_1;

public class CAR {

	// access modifiers: can be applied on data members of the class
	//data members: var + methods
	
	public String name;
	private int price;
	protected String model;
	String licNumber;
	
	//4 methods

	public static void main(String[] args) {
		
		CAR c = new CAR();
		c.name = "BMW";
		c.price = 30;
		c.model = "ABC";
		c.licNumber = "1234";
		
		

	}

}
