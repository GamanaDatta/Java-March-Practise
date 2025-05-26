package Keywords;

public class BMW extends Car {

	int speed = 200;
	int price = 400;

	
	public BMW() {
		super();
		System.out.println("BMW -- default const...");
	}
	
	public BMW(int i) {
		super(i);
		System.out.println("BMW -- param const..."+ i);
	}
	
	public BMW(int i, int j) {
		super(100);
		System.out.println("BMW -- two param const..."+ (i+j));
	}
	
	public void getFinalSpeed() {
		System.out.println(speed);//200
		int carSpeed = super.speed;
		System.out.println("car speed -->"+ carSpeed);//100
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("BMW -- start");
		System.out.println(super.price);//800
	}
	
	public void display() {
		System.out.println(super.speed);//100
		System.out.println(speed);//200
		super.start();//car start
		stop();//car stop
		start();//BMW start
		System.out.println(super.speed);//100
		super.start();//car start

	}
	

}
