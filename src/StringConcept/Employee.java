package StringConcept;

public class Employee {


	String name;
	int age;
	double salary;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Karthick";
		e1.age = 30;
		e1.salary = 23.44;
		
		System.out.println(e1.name);
		
		Employee e2 = new Employee();
		e2.name = "Karthick";
		e2.age = 45;
		e2.salary = 33.44;
		if(e1.name.equals(e2.name)) {
			System.out.println("names are equal");
		}
		
	
	}
	
}
