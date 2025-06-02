package OOP_Interfaces;

public class TestHospital {
	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.oncologyServices();
		fh.dentalServices();
		fh.cardioServices();
		fh.entServices();
		fh.neuroServices();
		fh.medicalTraining();
		fh.optServices();
		fh.emergencyServices();
		
		
		fh.medicalRnD();
		Medical.medicalNews();
		
		fh.covidVaccination();
		System.out.println(USMedical.MIN_FEE);//10
		System.out.println(FortisHospital.MIN_FEE);//100
		
		//USMedical.MIN_FEE = 100;
		
		USMedical.printBilling();//static method will be called using interface name
		FortisHospital.printBilling();
		
		fh.medicalRecords();
		
		System.out.println("-------------------");
		
		//child class object can be referred by parent interface ref variable
		//Top Casting
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.dentalServices();
		us.emergencyServices();
		us.covidVaccination();
		
		
		
		//interface to interface method access:
		//using interface to interface casting:
		//us ---> uk
		UKMedical ukm = (UKMedical)us;
		
		ukm.orthoServices();
		ukm.pediaServices();
		
		
		us.physioServices();
		us.emergencyServices();
		
		//
		IndianMedical in = (IndianMedical)us;
		in.entServices();
		in.cardioServices();
		in.emergencyServices();
		
		
		
		System.out.println("-------------");
		
		UKMedical uk = new FortisHospital();
		uk.orthoServices();
		uk.pediaServices();
		uk.neuroServices();
		uk.emergencyServices();
		uk.covidVaccination();
		
		
		//down casting: NA
		
	
		}

}
