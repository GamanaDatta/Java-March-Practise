package BuilderPattern;

public class AmazonTest {


	public static void main(String[] args) {

		//method chaining: actions of methods...
		
		Shopping shop = new Shopping();
		shop.login("naveen@gmail.com", "naveen@123")
			  .search("Apple Macbook pro")
			  	.addToCart("Macbook Pro M1 chip")
			  		.makePayment("naveen@okhdfc")
			  			.generateOrder()
			  				.sendEmailNotification()
			  					.logout();
		
		shop.trackOrder(shop.orderId);
							
		
		System.out.println("------------");
		
		shop.login("naveen@gmail.com", "naveen@123")
				.search("Tshirt", 2000)
					.addToCart("Nike Tshirt")
						.logout();
		
		System.out.println("------------");

		shop.login("naveen@gmail.com", "naveen@123")
				.makePayment("1234 1234 1234 5555", 123)
					.generateOrder()
						.logout();
		
		System.out.println("------------");
		
		shop.login("naveen@gmail.com", "naveen@123")
				.logout();	
		
		System.out.println("------------");
		shop.login("naveen@gmail.com", "naveen@123");
		
		System.out.println("------------");
		shop.logout();
			
		
		

		
	}
}
