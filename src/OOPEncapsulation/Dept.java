package OOPEncapsulation;

public class Dept {
	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		
//		e1.setName("Tom");
//		e1.setAge(10);
//		e1.setSalary(23.44);
//		e1.setActive(true);
//		
//		System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary() + " " + e1.isActive());
				
		Employee e1 = new Employee("tom", 20, 12.33, true);//POST CALL - initial values
		
		//GET -- Read
		System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary() + " " + e1.isActive());

		//PUT/Patch -- Update
		e1.setAge(21);
		e1.setSalary(15.44);
		
		//GET -- Read
		System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary() + " " + e1.isActive());
		
		//
		Customer c1 = new Customer();
		c1.setUserData(null, 0, 0, false);
		
		Customer c2 = new Customer();

		Customer c3 = new Customer();

		
	}
}
