package MyPackage;

public class BMW extends CAR{
	
	@Override
	public void start() {
		System.out.println("bmw -- start");
	}
	
	@Override
	protected void stop() {
		System.out.println("bmw -- stop");
	}
	
	//individual method of BMW
	private void refuel() {
		System.out.println("BMW -- refuel");
	}
	
	@Override
	public void autoParking() {
		System.out.println("bmw -- auto parking");
	}



}

