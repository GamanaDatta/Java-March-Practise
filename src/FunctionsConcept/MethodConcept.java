package FunctionsConcept;

import java.util.Arrays;

public class MethodConcept {

	//can not create a function inside a function
		//but I can call a function from another function
		//no concept of nested function
		//functions are parallel to each other
		//a function can return only one value/entity at a time
		
		public void test() {
			
			
		}
		
		public void name() {
			
		}
		
		public int caluclateSalary(int baseSalary, int bonus, int tax, boolean isApplicable, int performanceBonus) {
			
			int finalSalary = baseSalary+bonus-tax;
			
			if(isApplicable) {
				finalSalary = finalSalary + performanceBonus;
			}
			
			return finalSalary;
		}
		
		
		public String[] getProductList() {
			String product[] = {"macbook", "imac", "sim", "ipad"};
			return product;
		}
		
		
		

		public static void main(String[] args) {

			MethodConcept obj = new MethodConcept();
			//Shwetha:
			int salary =  obj.caluclateSalary(10000, 500, 5, true, 1000);
			 System.out.println(salary);
			 
			 //Ramya
			 salary =  obj.caluclateSalary(30000, 1000, 10, false, 0);
			 System.out.println(salary);
			 
			 System.out.println("----");
			 String pr[] = obj.getProductList();
			 System.out.println(pr.length);
			 System.out.println(Arrays.toString(pr));
		}

}
