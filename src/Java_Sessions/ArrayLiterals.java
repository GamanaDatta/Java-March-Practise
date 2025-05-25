package Java_Sessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		//Array Literals: static array:
				//but number of elements are already known
				
				int num[] = {10,20,30,40,50};//0-4
				//length = 5
				//li = 0
				//hi = 4
				
				//num[5] = 60;//AIOB
				
				System.out.println(num[0]);
				System.out.println(num[4]);
				//System.out.println(num[5]);//AIOB
				//System.out.println(num[-1]);//AIOB

				//new keyword:
				int i[] = new int[10];
				i[0] = 100;
				i[1] = 200;
				i[2] = 300;
				System.out.println(Arrays.toString(i));
				i[3] = 400;
				i[4] = 500;
				System.out.println(Arrays.toString(i));
				
				
				double salary[] = {12.33, 23.44, 56.66};
				System.out.println(salary.length);
				
				String browser[] = {"chrome", "firefox", "edge", "safari"};
				System.out.println(Arrays.toString(browser));
				System.out.println(browser.length);
				browser[0] = "chromium";
				System.out.println(Arrays.toString(browser));
				
				for(String e : browser) {
					System.out.println(e);
				}
				
				//
				Object empData[] = {"Tom", 30, 12.33, 'm', false};//0-4=5
				System.out.println(Arrays.toString(empData));
				System.out.println(empData.length);

				//empData[5] = "Banaglore";
				empData[4] = true;
				empData[0] = "Tom Automation";
				System.out.println(Arrays.toString(empData));
				
				for(Object e : empData) {
					System.out.println(e);
				}

				for(int p=0; p<empData.length; p++) {
					System.out.println(empData[p]);
				}
				
				System.out.println("---------------");
				
				//
				int number[] = {10,20,30,40,50};//0-4
				for(int k=number.length-1; k>=0; k--) {
					System.out.println(number[k]);//50 40 30 20 10
				}
				System.out.println("---------------");
				
				int count = number.length-1;//4
				for(int e : number) {
					e=count;//3
					System.out.println(number[e]);//50 40
					count--;//3
				}
				


	}

}
