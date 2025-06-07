package MyPackage;

public class CAR {
	
	public CAR() {

	}

	private CAR(int a) {

	}
	
	
	protected CAR(int a, int b) {
		
	}
	
	CAR(String a){
		
	}

	public void start() {
		System.out.println("car -- start");
	}

	protected void stop() {
		System.out.println("car -- stop");
	}

	private void refuel() {
		System.out.println("car -- refuel");
	}

	void autoParking() {
		System.out.println("car -- auto parking");
	}

}
