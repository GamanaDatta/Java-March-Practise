package ClassConcept;

public class Employee {
	//class properties, class variables
		String name="dat";
		String designation;
		int id=100;
		String dept;
		boolean isPermanent;
		

		public static void main(String[] args) {

			//class -- blueprint, template, category for all the objects
			//Human --name, age, height
			//Laptop -- name, brand, price, color, RAM
			//Employee -- name, desgination, city, dept, manager
			
			//Create the object: using new keyword
			Employee obj = new Employee();
			
			//Employee -- class
			//obj -- object reference variable; type of the obj: Employee
			//new Employee(); -- object -- RHS
			
			System.out.println(obj.name);
			System.out.println(obj.id);
			System.out.println(obj.isPermanent);
			
			System.out.println("point 1");
			
			obj.name = "Tom";
			obj.designation = "Manager";
			obj.id = 100;
			obj.dept = "Admin";
			obj.isPermanent = true;
			System.out.println("point 2");
					
			
			System.out.println(obj.name);
			System.out.println(obj.id);
			System.out.println(obj.isPermanent);
			System.out.println(obj.designation);
			System.out.println(obj.dept);
					
			System.out.println("-----------");
			//
			Employee e1 = new Employee();
			e1.name = "Pooja";
			e1.id = 145;
			e1.dept = "QA";
			e1.designation = "SDET";
			e1.isPermanent = false;
			
			System.out.println(e1.name);
			System.out.println(e1.id);
			System.out.println(e1.isPermanent);
			System.out.println(e1.designation);
			System.out.println(e1.dept);//QA
			
			
			//object without reference name:
			new Employee();
			new Employee().name = "Peter";
			new Employee().id = 500;
			
			System.out.println("--------------");
			System.out.println(new Employee().id);
			System.out.println(new Employee().name);

			System.out.println(new Employee().dept);

			
			System.out.println("--------------");

			
			//
			Employee e2 = new Employee();
			e2 = null;
			//e2.name = "Abhi";//NPE		
			//System.out.println(e2.name);
			
			//System.gc();//calling the GC programatically
			
			//
			Employee e3 = new Employee();
			e3 = null;
			e3 = new Employee();
			
			
			
		}

}
