package FunctionsConcept;

public class Testing {
	int a;//instance/object
	static String name;//class var
	
	
	// Method Overloading: Poly(many) + Morphism (forms) : CompileTime(static)
	// Polymorphism/binding
	// within the same class when you have multiple methods
	// 1. with the same name
	// 2. with the different number of parameters
	// 3. with the different sequence of the parameters(if number of params are same)
	// 4. return type does not matter

	public void test() { // 0 param
		System.out.println("test method");
	}

//	public int test() { //0 param
//		System.out.println("test method");
//		return 100;
//	}

	public void test(int a) {// 1 param
		System.out.println("test method " + a);
	}

	public void test(String a) {// 1 param
		System.out.println("test method " + a);
	}
	

	public void test(int a, int b) {// 2 params
		System.out.println("test method " + a + b);
	}

	public void test(int a, String b) {// 2 params
		System.out.println("test method " + a + b);
	}

	public void test(String a, int b) {// 2 params
		System.out.println("test method " + a + b);
	}
	
	public void test(double a, int b, double c) {// 2 params
		System.out.println("test method " + a + b);
	}

	// login:
	public void login() {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, int otp) {

	}

	public void login(String un, String pwd, String socialMedia) {

	}

	// search:
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, String brand) {

	}

	public void search(String name, String brand, int price) {

	}

	// payment:
	public void makePayment(String upi) {

	}

	public void makePayment(String cc, int cvv) {

	}

	public void makePayment(String cc, int cvv, int otp) {

	}

	public void makePayment(String un, String pwd, int otp) {

	}

	// booking uber:
	//AC: booking feature: 
	public void booking(String stPoint, String endPoint) {

	}

	public void booking(String stPoint, String endPoint, String carType) {

	}
	
	public void booking(String stPoint, String endPoint, String carType, int pessangers) {

	}

	public static void main(String[] args) {

		Testing obj = new Testing();
		obj.test();
		obj.test(10);
		obj.test("selenium");
		obj.test("cypress", 100);

	}

}
