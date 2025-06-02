package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {

		if (name.equals("tom")) {
			return 90;
		} 
		else if (name.equals("peter")) {
			return 95;
		} 
		else if (name.equals("lisa")) {
			return 85;
		} 
		else {
			System.out.println("student not found....");
			throw new MyException("====student not found===" + name);
		}

	}

	public static void main(String[] args) {

		int m1 = getMarks("naveen");
		System.out.println(m1);

		if (m1 >= 0) {
			System.out.println("print the marksheet");
		}

		System.out.println("enter the url");
		
		
		//
//		try
//		catch AE
//		catch NPE
//		catch AIOB
//		catch RuntimeException
//		catch Excetpion
//		catch Throwable
		
		//final and finally and finalize
		
		

	}

}