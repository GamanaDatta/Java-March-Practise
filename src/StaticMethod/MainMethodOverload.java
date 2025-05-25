package StaticMethod;

public class MainMethodOverload {
	//main method can be overloaded
		//but jvm will always check psvm:String[] --> this is mandatory
		
		
		
		//psvm:String[]
		public static void main(String a[]) {
			System.out.println("this is my main method");
			MainMethodOverload.main(10);
		}
		
		
		public static void main(int a[], String b[]) {
			System.out.println("main "+ a);
		}
		
		public static void main(int a) {
			System.out.println("hi main "+ a);
		}
		
		public static void main(int a, int b) {
			System.out.println("main "+ a+b);
		}
		
		public static void main(int a, String b) {
			System.out.println("main "+ a+b);
		}
		
		
}
