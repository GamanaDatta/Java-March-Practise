package ConstructorConcept;

public class Employee {
	// Global
		String name;
		int age;
		double salary;
		String dob;
		boolean isActive;
		char gender;

		// constructor of the class:
		// will help me to create the object on the basis of given requirement
		//will help to initialize the instance variable using this keyword
		// const... will be called when we create the object; depends on the passing
		// values
		// const.. will have the same name as the class name
		// duplicate const.. are not allowed in the class
		// but we can overload the const... with different params
		// const.. will never return anything...no return type, no void
		// const.. is not a function
		//const...should not have the buss logic.
		//buss logic should be written in the function..and function will return something...
		
		
		//function vs const..
		//func can have any name, but const.. will have the same name as the class name
		//func may or may not return but const.. will never return
		//no buss logic in const... buss logic should be the function
		//const.. can not be static, function can be static
		//function will be called using object ref name or using the class, but const.. will be called when we create the object
		//function / const.. can be overloaded
		//const.. is preventing to create unnecessary objects, function will have buss logic
		//const.. is used to init the instance variables using this keyword		

//		public Employee() {//0 param -- default const...
//			System.out.println("const.. 0 param");
//		}
	//	
//		public Employee(int a) {//1 param
//			System.out.println("const.. 1 param " + a);
//		}
	//	
//		public Employee(int a, String b) {//2 params
//			System.out.println("const.. 2 params " + a+b);
//		}

		// AC: emp reg form:
		// name, age
		// name, age, dob
		// name, age, salary
		// name, age, salary, dob, isActive, gender
		// no info --> no employee reg--> no need to create employee with blank info

		public Employee(String name, int age) {
			// this.G = L
			this.name = name;
			this.age = age;
		}

		public Employee(String name, int age, String dob) {
			// this.G = L
			this.name = name;
			this.age = age;
			this.dob = dob;
		}

		public Employee(String name, int age, double salary) {
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		public Employee(String name, int age, double salary, String dob, boolean isActive, char gender) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.dob = dob;
			this.isActive = isActive;
			this.gender = gender;
		}

		public static void main(String[] args) {
			
//			Employee e2 = new Employee(10);
//			Employee e3 = new Employee(100, "selenium");

			
			// CRUD:

			// Create -- POST
			Employee e1 = new Employee("Abhi", 30);// 1st time: while creating the object: name, age
			// Read -- GET
			System.out.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isActive + " " + e1.dob + " " + e1.gender);
			// Update -- PUT/Patch
			e1.salary = 30.22;
			e1.isActive = true;
			// Read -- GETbbbbbb
			System.out
					.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isActive + " " + e1.dob + " " + e1.gender);
			// Update -- PUT/Patch
			e1.dob = "01-01-1990";
			// Read -- GET
			System.out
					.println(e1.name + " " + e1.age + " " + e1.salary + " " + e1.isActive + " " + e1.dob + " " + e1.gender);

			//
			Employee e2 = new Employee("Revathy", 35, "01-01-1995");
			
			//
			Employee e3 = new Employee("sonali", 35, 34.55, "01-09-1995", true, 'f');//POST
			System.out.println(e3.name + " " + e3.age + " " + e3.salary + " " + e3.isActive + " " + e3.dob + " " + e3.gender);//GET
			
			e3.salary = 44.55;//PUT
			System.out.println(e3.name + " " + e3.age + " " + e3.salary + " " + e3.isActive + " " + e3.dob + " " + e3.gender);//GET

			//no info:
			Employee e4 = new Employee("siva", 20);		

		}

}
