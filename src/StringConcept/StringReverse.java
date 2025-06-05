package StringConcept;

public class StringReverse {

	public static String reverse(String str) {
		int len;
		
		//null check
		try {
			len = str.length();//1
		} 
		catch (NullPointerException e) {
			return str;
		}

		// len is zero check
		if (len == 0) {
			return str;
		}

		// len is 1 check
		if (len == 1) {
			return str;
		}

		//String rev = "";
		StringBuilder sb = new StringBuilder();
		for (int i=len - 1; i>=0; i--) {
			//rev = rev + str.charAt(i);
			sb = sb.append(str.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		// test cases: with test data:
		String s1 = reverse("selenium");//O(n)--worst case
		System.out.println(s1);

		s1 = reverse("testing");//O(n)
		System.out.println(s1);

		s1 = reverse("T");//O(1)--best case
		System.out.println(s1);//T

		s1 = reverse("123");//O(n)--avg case
		System.out.println(s1);

		s1 = reverse("");
		System.out.println(s1);

		s1 = reverse(null);
		System.out.println(s1);//null
		
		s1 = reverse(" ");
		System.out.println(s1);
		
		s1 = reverse("selenium#$#$#$");
		System.out.println(s1);

	}
}
