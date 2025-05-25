package Java_Sessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		
			//a collection/data structure: which can hold similar types of values
			
			//limitations of array:
			//1. size is fixed: static array: to overcome this problem, we have to use dynamic array: ArrayList, Collections
			//2. it can store only similar type of family data: to overcome this problem, use static Object array, ArrayList with Generics
					
			//month: 12 / days 31: 
			//menu items: category
			//footer links: 15
			
			//decalration:
			//1. using new keyword:
			//int array
			int i[] = new int[5];//0-4
			//i[-1] = 400;//AIOB
			i[0] = 10;
			i[1] = 20;
			i[2] = 30;
			i[3] = 40;
			i[4] = 50;
			//i[5] = 60;//AIOB
			
			System.out.println("length = "+ i.length);//5
			System.out.println("Li= " + 0);
			System.out.println("Hi= " + (i.length-1));
			
			System.out.println(i[0]);
			System.out.println(i[4]);
			
			//System.out.println(i[5]);//AIOB
			//System.out.println(i[-1]);//AIOB
			
			System.out.println("----------");
			//to print all the values of array: for loop
			//index loop:
			for(int k=0; k<=i.length-1; k++) {
				System.out.println(i[k]);
			}
			
			System.out.println("----------");
			//for each loop:
			for(int e : i) {
				System.out.println(e);
			}
			
			System.out.println("----------");
			
			System.out.println(i);  
			System.out.println(Arrays.toString(i));//[10, 20, 30, 40, 50]--logging
			
			System.out.println("----------");

			
			//
			int p[] = new int[50];//0-49
			p[0] = 100;
			p[3] = 200;
			
			System.out.println(p[0]);//100
			System.out.println(p[1]);
			System.out.println(p[2]);
			System.out.println(p[3]);
			System.out.println(Arrays.toString(p));
			
			System.out.println("----------");
			
			//byte array
			byte b[] = new byte[2];//0-1
			System.out.println(Arrays.toString(b));
			b[0] = 5;
			b[1] = 10;
			System.out.println(Arrays.toString(b));

			System.out.println("----------");
			//double array:
			double d[] = new double[3];//0-2
			System.out.println(Arrays.toString(d));
			d[0] = 12.33;
			d[1] = 23.44;
			d[2] = 34.55;
			System.out.println(Arrays.toString(d));

			for(double e : d) {
				System.out.println(e);
			}
			
			System.out.println("----------");
			float t[] = new float[2];//0-1
			t[0] = 10.99f;
			t[1] = 120;
			
			System.out.println(Arrays.toString(t));
			System.out.println(t[0]+t[1]);

			System.out.println("----------");
			
			char ch[] = new char[4];//0-3
			ch[0] = 'a';
			ch[1] = 'B';
			ch[2] = '0';
			ch[3] = '$';
			System.out.println(Arrays.toString(ch));

			for(char e : ch) {
				System.out.println(e);
			}

			System.out.println("----------");

			String browser[] = new String[4];//0-3
			browser[0] = "chrome";
			browser[1] = "firefox";
			browser[2] = "edge";
			browser[3] = "safari";

			System.out.println(Arrays.toString(browser));
			System.out.println(browser.length);
			
			//for: index loop:
			for(int k=0; k<=browser.length-1; k++) {
				System.out.println(browser[k]);
			}
			
			System.out.println("----------");
			
			for(String e : browser) {
				System.out.println(e);//chrome firefox edge
					if(e.equals("edge")) {
						System.out.println("launch edge browser");
						break;
					}
			}
			
			
			System.out.println("------------------");
			
			//Object is a super class of all the classes in java by default.
			//Object array:
			//name(String), age(int), salary(double), gender(char), isPermanent(boolean)
			
			Object empData[] = new Object[5];//0-4
			
			System.out.println(Arrays.toString(empData));
			
			empData[0] = "Sweta";
			empData[1] = 30;
			empData[2] = 45.44;
			empData[3] = 'f';
			empData[4] = true;

			System.out.println(Arrays.toString(empData));

			for(Object e : empData) {
				System.out.println(e);
			}

	}

}
