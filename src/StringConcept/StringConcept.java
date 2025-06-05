package StringConcept;

public class StringConcept {

	public static void main(String[] args) {

		//String literal
		String st = "selenium";
		
		String s2 = "selenium";
		
		//new :
		String s1 = new String("testing");//1-heap, 1-scp
		
		String s3 = "testing";//SCP
		String s4 = "testing";
		
		System.out.println(s3==s4);//true
		
		System.out.println(s3==s1);//false

		System.out.println(s3.equals(s1));//true
		System.out.println(s3.equals(s4));//true
		
		//
		String name = new String("Tom");//heap-1, scp-1 = 2
		String n1 = "Tom";//0
		
		String p1 = "Cypress";
		String p2 = "Cypress";
		String p3 = "Cypress";
		String p4 = "Cypress";

		int i = 10;
		int j = 10;
		int k = 10;
		
		
	}
	
}
