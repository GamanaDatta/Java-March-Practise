package ClassConcept;

public class User {
	String name;
	int age;
	String city;
	

	public static void main(String[] args) {

		
		User u1 = new User();
		u1.name = "Abhi";
		u1.age = 30;
		u1.city = "Pune";
		
		User u2 = new User();
		u2.name = "Sweta";
		u2.age = 35;
		u2.city = "Banaglore";
		
		User u3 = new User();
		u3.name = "Revathy";
		u3.age = 25;
		u3.city = "LA";
		
		User u4 = new User();
		u4.name = "Vani";
		u4.age = 20;
		u4.city = "NY";
		
		
		u1=u2=u3=u4;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);


//		System.out.println("-------------");
//		
//		u1 = u2;
//		System.out.println(u1.name + " " + u1.age + " " + u1.city);//S
//		System.out.println(u2.name + " " + u2.age + " " + u2.city);//S
//		System.out.println(u3.name + " " + u3.age + " " + u3.city);//R
//		
//		System.out.println("-------------");
//		
//		u2 = u3;
//		System.out.println(u1.name + " " + u1.age + " " + u1.city);//S
//		System.out.println(u2.name + " " + u2.age + " " + u2.city);//R
//		System.out.println(u3.name + " " + u3.age + " " + u3.city);//R
//		
//		System.out.println("-------------");
//		
//		u3 = u1;
//		System.out.println(u1.name + " " + u1.age + " " + u1.city);//S
//		System.out.println(u2.name + " " + u2.age + " " + u2.city);//R
//		System.out.println(u3.name + " " + u3.age + " " + u3.city);//S
		
		
	}


}
