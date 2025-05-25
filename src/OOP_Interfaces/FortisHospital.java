package OOP_Interfaces;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	static final int MIN_FEE = 100;
	
	
	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");
	}

	// UK
	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");
	}

	// India
	@Override
	public void entServices() {
		System.out.println("FH -- entServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
	}

	// common
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	// individual
	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}

	public void optServices() {
		System.out.println("FH -- optServices");
	}

	//
	@Override
	public void medicalRnD() {
		System.out.println("FH R&D");
	}

	// WHO
	

	//UN
	@Override
	public void newsLetter() {
		System.out.println("FH -- newsLetter");
	}
	
	
	//method hiding
	public static void printBilling() {
		System.out.println("FH -- billing");
	}
	
	//default method can be overridden in the child class with public 
	@Override
	public void medicalRecords() {
		System.out.println("FH -- medical records");
	}

	@Override
	public void covidVaccination() {
		// TODO Auto-generated method stub
		
	}

}
