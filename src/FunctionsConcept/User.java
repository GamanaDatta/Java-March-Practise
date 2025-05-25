package FunctionsConcept;

public class User {

	public int getUserBillAmount(String userName) {
		System.out.println("getting bill amount for : " + userName);
		//int amount = -1;
		
		if (userName.equals("tom")) {
			return 1000;
			//amount = 100;
		} 
		else if (userName.equals("sirish")) {
			return 1200;
			//amount = 1200;
		} 
		else if (userName.equals("gaurav")) {
			return 500;
			//amount = 500;
		} 
		else {
			System.out.println("user not found..." + userName);
			return -1;
		}
		
	}

	public static void main(String[] args) {
		User u1 = new User();
		int num = u1.getUserBillAmount("naveen");
		System.out.println(num);
		if(num<0) {
			System.out.println("no need to generate the invoice...");
		}
		else {
			System.out.println("send the invoice...");
		}
	}

}
