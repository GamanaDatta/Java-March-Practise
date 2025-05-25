package OOP_Interfaces;

public interface UKMedical extends WHO{

	public void orthoServices();

	public void pediaServices();

	public void neuroServices();
	
	public void emergencyServices();
	
	default void medicalRecords() {
		System.out.println("UK -- medical records");
		System.out.println("UK -- medical records");

	}

}
