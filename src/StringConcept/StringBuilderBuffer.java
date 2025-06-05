package StringConcept;

public class StringBuilderBuffer {
	
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("selenium");
		
		System.out.println(sb);
		sb = sb.append("automation");
		System.out.println(sb);
		
		
		StringBuffer sf = new StringBuffer("plyawright");
		System.out.println(sf);
		sf = sf.append("automation");
		System.out.println(sf);
		
		System.out.println("------");
		
		String s = "My Automation";//MA
		s.concat("with selenium");//MAWS
		System.out.println(s);//MA
		
		System.out.println("------");

		StringBuilder sb1 = new StringBuilder("automation");//
		sb1.append("with new selenium");//AWNS
		System.out.println(sb1);//AWNS
		
		System.out.println("------");
		StringBuffer sf1 = new StringBuffer("plyawright");
		sf1.append("with chrome "+"browser");
		System.out.println(sf1);
		
		
		System.out.println("------");
		
		String sr = new String("restapi");
		sr.concat("automation");
		System.out.println(sr);
		
		String tr = "restapiautoamtion";
		
		
	}

}
