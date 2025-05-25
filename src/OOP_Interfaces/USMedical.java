package OOP_Interfaces;

public interface USMedical extends WHO, UN{
	//interface methods can not have any method body -- this is called Abstract Method
		//method declaration- method prototype
		//no buss logic in interface methods
		//can not create the object of Interface
		//abstract method -- no method body -- abstraction -- hiding the implementation
		
		//100% abstraction
		
		
		//interface vars: by default static & final
		int MIN_FEE = 10;
		
		
		public void physioServices();
		
		public void oncologyServices();
		
		public void dentalServices();
		
		public void emergencyServices();
		
		//after JDK 1.8: two major changes:
		//1. we can have a static method with method body: this is not abstract method
		//can not override
		public static void printBilling() {
			System.out.println("US -- billing");
		}
		
		//2. we can have a default method with method body (buss logic): non static method
		//default keyword -- is only for interface
		//can be overridden -- 
		default void medicalRecords() {
			System.out.println("US -- medical records");
		}
}
