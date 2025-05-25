package OOPEncapsulation;

public class Employee {
	
	// private vars
		private String name;
		private int age;
		private double salary;
		private boolean isActive;
		
		
		//public const.. working like a setter for the initial values
		public Employee(String name, int age, double salary, boolean isActive) {
			this.name = name;
			if(age>=18) {
				this.age = age;
			}
			else {
				System.out.println("age can not be less than 18");
			}		
			this.salary = salary;
			this.isActive = isActive;
		}

		// public getter/setter:
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			//age>=18
			if(age>=18) {
				this.age = age;
			}
			else {
				System.out.println("age can not be less than 18");
			}
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

//		public static void main(String[] args) {
	//
//			Employee e1 = new Employee();
//			e1.name = "Tom";
//		}

}
