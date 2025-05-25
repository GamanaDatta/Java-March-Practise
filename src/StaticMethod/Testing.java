package StaticMethod;

public class Testing {
	//static method can be overloaded
		public static void sendMail() {//0 param
			System.out.println("send mail");
		}
		
		public static void sendMail(String subject) {//1 param
			System.out.println("send mail with "+subject);
		}
		
		public static void sendMail(String subject, String to) {//2 params
			System.out.println("send mail with "+subject + " " + to);
		}
		
		public static void sendMail(String subject, String to, String cc) {//3 params
			System.out.println("send mail with "+subject + " " + to+ " "+ cc);
		}
		
		
		

		public static void main(String[] args) {

			Testing.sendMail("training", "naven@gmail.com", "automation@gmail.com");
			
			
			
		}

}
