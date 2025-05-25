package FunctionsConcept;

public class Employee {

	// methods/functions:

	// can not create a function/method inside a function/method
	// create method within the class

	// 1. no input & no return:
	// name: test
	// no return: void: can not return anything
	public void test() {
		System.out.println("test method");
	}

	// 2. no input but some return:
	// return type: String
	public String getTrainerName() {
		System.out.println("getting trainer name....");
		String name = "Naveen";
		return name;
	}

	// return type: int
	public int getMarks() {
		System.out.println("getting final marks");
		int a = 10;
		int b = 20;
		int c = -5;
		int finalMarks = a + b + c;
		return finalMarks;
	}

	public boolean isElementExist() {
		System.out.println("checking ele exists");
		return false;
	}

	public int getNum() {
		return 100;
	}

	public void click(String element) {
		System.out.println("click on ele: "+ element);
	}
	
	public void sendKeys(String element, String value) {
		System.out.println("fill on ele: "+ element+ " with value: "+ value);
	}

	// 3. some input and some return:
	// parameters: 2
	// return type: int
	public int add(int a, int b) { // parameters
		System.out.println("adding two numbers...");
		int sum = a + b;
		return sum;
	}

	// caller method
	public static void main(String[] args) {
		System.out.println("main method");
		// create the object of this class:
		Employee e1 = new Employee();
		e1.test();

		String n = e1.getTrainerName();
		System.out.println(n);
		if (n.equals("Naveen")) {
			System.out.println("lets open NAL");
		}

		System.out.println(e1.getTrainerName());

		int m = e1.getMarks();
		System.out.println(m);

		boolean flag = e1.isElementExist();
		if (flag) {
			System.out.println("click on it...");
		} else {
			System.out.println("ele not found...");
		}

		int s1 = e1.add(10, 20);// arguments/values: call by value
		System.out.println(s1);

		int s2 = e1.add(-90, -90);
		System.out.println(s2);

	}

}
