package StringConcept;

import java.util.Arrays;

public class StringMethods {
	
	String name;
	int age;


	@Override
	public String toString() {
		return "StringMethods [name=" + name + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		
		
		String str = "hi this is my java code and i am so happy";
		
		System.out.println(str.length());//41: 0-40

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));//StringIndexOutOfBoundsException
		//System.out.println(str.charAt(-1));//SIOB
		
		System.out.println(str.indexOf('h'));//0
		System.out.println(str.indexOf('i'));//1 : 1st occurrence of i
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of i

		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i')+1)+1));//3rd occurrence of i

		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("python"));//-1
		
		String mesg = "welcome admin";
		if(mesg.indexOf("admin") == 8) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}

		//contains:
		String mg = "I love java programming";
		if(mg.contains("java")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/login";
		if(url.indexOf("https") == 0) {
			System.out.println("PASS");
		}
		
		if(url.contains("route=account/login")) {
			System.out.println("PASS");
		}
		
		//trim:
		String test = "     hello testing    ";
		System.out.println(test.trim());
		
		//replace:
		String rest = "   hello selenium    ";
		System.out.println(rest.replace(" ", ""));
		
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		String mg1 = "I love java programming";
		System.out.println(mg1.replace("java", "python"));
		
		//lowercase and uppercase:
		String pop = "I love java programming";
		System.out.println(pop.toUpperCase());
		System.out.println(pop.toLowerCase());
		
		//startswith:
		System.out.println(pop.startsWith("I love"));
		System.out.println(pop.endsWith("programming"));
		
		//equals:
		String m1 = "hello selenium";
		String m2 = "Hello selenium";
		
		System.out.println(m1.equals(m2));//false
		System.out.println(m1.equalsIgnoreCase(m2));//true
		
		//split:
		String lang = "Java_Python_Javascript_Ruby";
		String lg[] = lang.split("_");
		
		System.out.println(lg[0]);
		System.out.println(Arrays.toString(lg));
		
		System.out.println("-----------");
		
		String top = "xXhelloXxXseleniumXxXtestingXXxXautomationX";
		
		String t[] = top.split("xX");
		
		System.out.println(t[0]);//nothing
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println(t[3]);
		System.out.println(t[4]);
		
		System.out.println("-----------");
		
		String data = "pooja;sharma;bangalore;IBM;SDET;QA";
		
		String d[] = data.split(";");

		for(String e : d) {
			System.out.println(e);
		}
		
		System.out.println("-----------");
		//
		String domain = "pooja.sharma.bangalore.IBM.SDET.QA";
		String dom[] = domain.split("\\.");
		System.out.println(dom[0]);
		
		String tree = "sonali||sharma||bangalore||IBM||SDET||QA";
		String tr[] = tree.split("\\|\\|");
		System.out.println(tr[0]);
		System.out.println(tr[1]);
		System.out.println(tr[2]);
		//escape char: . | ||
		
		System.out.println("-----------");

		
		String xpath = "//input[@id=\"automation\"]";
		System.out.println(xpath);
		
		String message = "I love \"java\" programming"; //op: I love "java" programming
		System.out.println(message);
		
		
		String mgg = "I love 'java' programming"; //op: I love 'java' programming
		System.out.println(mgg);

		//subString:
		String trMesg = "your order id is 12345";
		
		System.out.println(trMesg.substring(3));//start from 3 up to the end of the string
		System.out.println(trMesg.substring(17));//12345
		
		System.out.println(trMesg.substring(0, 6));//your or
				
		System.out.println(trMesg.substring(trMesg.indexOf("is")+3, trMesg.length()));
		
		
		String pr = "pooja\\sharma\\bangalore";

		String pg[] = pr.split("\\\\");
		System.out.println(pg[0]);
		
		
		String bh = "I love java and I can not live without java programming";
		
		String ar[] = bh.split("java");
		
		System.out.println(Arrays.toString(ar));
		
		
		String ds = new String("talha khan");
		System.out.println(ds);
		
		StringMethods obj = new StringMethods();
		obj.name = "talha";
		obj.age = 30;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj);
		
		
		String t2="lets.tr\\\\y.this";
		String r[] = t2.split("\\.");
		System.out.println(Arrays.toString(r));
		
	}
	

}
