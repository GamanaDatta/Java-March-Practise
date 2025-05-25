package StaticMethod;

import java.util.Arrays;

public class B {
	

		public static void main(String[] b) {
			System.out.println("B -- main");
			System.out.println(Arrays.toString(b));
			
			String t1[] = {"a", "b"};
			String t2[] = {"c", "d"};
			B.main(t1, t2);
		}
		
		public static void main(String[] b, String a[]) {
			System.out.println("B -- 2nd main");
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(a));
		}

}
