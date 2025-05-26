package OOP_Inheritance;

public class TestCar {
	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		System.out.println(b.speed);//200
		b.speed = 400;
		
		b.engine();
		b.myLoading();
		b.restart();
		BMW.billing();//parent class static method can be called using child class name but if child has the same static method then child class method will be called
		Car.billing();
		b.carLocking();
		
		
		System.out.println("------");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println(c.speed);//100
		c.engine();
		Car.billing();
		c.carLocking();
		
		
		System.out.println("------");
		Audi au = new Audi();
		au.start();
		au.stop();
		au.refuel();
		au.theftSafety();
		System.out.println(c.speed);//100
		au.engine();
		
		System.out.println("----------");
		//child class object can be referred by parent class ref variable
		//Top/up casting
		//IS_A relationship
		Car c1 = new BMW();
		c1.start();//overridden
		c1.stop();//inherited
		c1.refuel();//inherited
		//can not access autoParking() -- individual method --ref type check is failed
		System.out.println(c1.speed);//100 -- car --not applicable for variables
		
		//down casting:
		//parent class object can be referred by child class ref variable???
		//BMW b1 = (BMW) new Car();//ClassCastException -- RT exception
		
		
		
		
		
	}

}
