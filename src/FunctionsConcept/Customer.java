package FunctionsConcept;

import java.util.ArrayList;

public class Customer {
	public ArrayList<String> getProductList(String name) {
		System.out.println("getting the product list for customer: " + name);

		ArrayList<String> productList = new ArrayList<String>();// pc=0: size:0

		if (name.equals("ramya")) {
			productList.add("imac");
			productList.add("Macbook pro");
			productList.add("ipad");
		}

		else if (name.equals("shwetha")) {
			productList.add("samsung galaxy");
			productList.add("samsung tablet");
		}

		else if (name.equals("ravi")) {
			productList.add("Airtel SIM");
		}

		else {
			System.out.println("cusotmer not found...");
		}
		
		return productList;
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		ArrayList<String> prList = c1.getProductList("naveen");
		System.out.println(prList);
		System.out.println(prList.size());

	}

}
