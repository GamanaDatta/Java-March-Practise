package BuilderPattern;

public class Shopping {

	public int orderId;

	public Shopping login() {
		System.out.println("login to app");
		return this; //return current class object with this keyword
	}

	public Shopping login(String un, String pwd) {
		System.out.println(" login with creds: " + un + " : " + pwd);
		return this;
	}

	public Shopping search() {
		System.out.println("default search with default products...");
		return this;
	}

	public Shopping search(String productName) {
		System.out.println("search with product name..." + productName);
		return this;
	}

	public Shopping search(String productName, int price) {
		System.out.println("search with product name..." + productName + " and price " + price);
		return this;
	}

	public Shopping addToCart(String productName) {
		System.out.println("adding to cart: " + productName);
		return this;
	}

	public Shopping makePayment(String upi) {
		System.out.println("making payment via : " + upi);
		return this;
	}

	public Shopping makePayment(String cc, int cvv) {
		System.out.println("making payment cc : " + cc + " : " + cvv);
		return this;
	}

	public Shopping generateOrder() {
		orderId = 12345;
		System.out.println("your order id is:" + 12345);
		return this;
	}
	
	public Shopping sendEmailNotification() {
		System.out.println("sending email ");
		return this;
	}

	public Shopping logout() {
		System.out.println("logout from application");
		return this;
	}
	
	
	public void trackOrder(int orderId) {
		System.out.println("tracking the order : "+ orderId);
		
	}
	
	
	
	
	
	

}
