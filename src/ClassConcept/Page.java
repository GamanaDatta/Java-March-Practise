package ClassConcept;

public class Page {

	String title;
	String partialUrl;
	static String baseUrl = "https://www.abc.com";
	int loadingTime;
	static final String logo = "abc.png";
	static final String footer = "help";

	public static void main(String[] args) {
		int bill = 200;
		final int days = 7;

		Page p1 = new Page();

		Page.baseUrl = "https://www.abc.com";
		System.out.println(Page.baseUrl);
		
		

		// QA:
		Page.baseUrl = "https://www.qa.abc.com";
		System.out.println(Page.baseUrl);

		// stage:
		Page.baseUrl = "https://www.stage.abc.com";
		System.out.println(Page.baseUrl);
		
		//oms: 
		Page.baseUrl = "https://www.oms.com";
		

}
}
