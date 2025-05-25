package StaticMethod;

public class Employee {
	
	public void getMail() {
		System.out.println("get mail");
	}
	
	public static void sendMail() {
		System.out.println("send mail");
	}
	
	
	//user method/ caller method
	//no buss logic
	//void: no return coz of no buss logic
	//static: 
	//psvm: String[]
	public static void main(String a[]) {
		
		//System.out.println(a[0]);//AIOB
		

		//1. how to access non static method: need to create the object of the class
		Employee e1 = new Employee();
		e1.getMail();
		
		e1.sendMail();//The static method sendMail() from the type Employee should be accessed in a static way
		
		//2. how to access static method:
		//a. calling it directly:
		sendMail();
		
		//b. using the class name:
		Employee.sendMail();
		
		
		
	}

}
