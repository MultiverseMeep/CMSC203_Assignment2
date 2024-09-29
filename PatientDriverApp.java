package patientClass;

/*
 * Class: CMSC 203
 * Instructor: Grigoriy Grinberg
 * Description: Java class practice
 * Due: 09/30/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently. I have not copied the code from a student or any source. I have not given my code to any student
 * Alayna Goss
 */



public class PatientDriverApp {

	
	public static void main(String[] args){
	
		//Create patient
		
		
		//Patient alayna = new Patient("Alayna", "Loreley", "Goss", "100 Frederick Road", "Rockville", "Maryland", "20855", 1234567890, "Kira", "Hagge", 1987654321);
		
		/*
		 * This is for test Case 3 and 4: I added the data afterwards as well to make sure that the mutators were working
		 */
		Patient alayna = new Patient();
		alayna.setFirstName("Alayna");
		alayna.setMiddleName("Loreley");
		alayna.setLastName("Goss");
		alayna.setAddress("100 Frederick Road");
		alayna.setCity("Rockville");
		alayna.setState("Maryland");
		alayna.setZipCode("20855");
		alayna.setPhoneNumber(1234567890);
		alayna.setEmergencyFirstName("Kira");
		alayna.setEmergencyLastName("Hagge");
		alayna.setEmergencyPhoneNumber(1987654321);
		/*
		*/
		
		
		//Create procedure with no-arg constructor
		Procedure Procedure1 = new Procedure();
		Procedure1.setProcedureName("Post-Op");
		Procedure1.setDoctorName("Dr. Liang");
		Procedure1.setProcedureDate("February 10th");
		Procedure1.setCharges(350);
		
		//Create procedure with partial-arg constructor
		Procedure Procedure2 = new Procedure("Wisdom Teeth Removal", "November 14th");
		Procedure2.setDoctorName("Dr. Hornstein");
		Procedure2.setCharges(1000);
		
		//Create procedure with full args constructor
		Procedure Procedure3 = new Procedure("Annual Checkup", "September 30th", "Dr. Liang", 150);
		
		//Display necessary data nicely
		displayFormattedData(alayna, Procedure1, Procedure2, Procedure3);
		System.out.println("\nStudent Name: Alayna Goss\nMC#: M21171661\nDue Date: 09/30/2024");
		
		
		/*  
		 * Professor- your instructions for the PatientDriverApp Class say to separate the procedure data with commas.
		 * However, the example you use separates the data with tabs.
		 * I implemented both- If you would prefer the comma separated values, just uncomment the below code.
		 * 
		displayPatient(alayna);
		displayProcedure(Procedure1);
		displayProcedure(Procedure2);
		displayProcedure(Procedure3);
		calculateTotalCharges(Procedure1, Procedure2, Procedure3);
		*/
	}
	
	/*
	 * Displays all patient and procedure data in the format with tabs that you included in your example document
	 */
	static void displayFormattedData(Patient p, Procedure p1, Procedure p2, Procedure p3)
	{
		System.out.println("Patient info:");
		System.out.println("\tName: " + p.buildFullName());
		System.out.println("\tAddress: " + p.buildAddress());
		System.out.println("\tEmergency Contact: " + p.buildEmergencyContact() + "\n");
		
		
		
		System.out.println("\t\tProcedure: " + p1.getProcedureName());
		System.out.println("\t\tProcedure Date: " + p1.getProcedureDate());
		System.out.println("\t\tPractitioner: " + p1.getDoctorName());
		System.out.println("\t\tCharges: " + p1.getCharges() + "\n");
		
		System.out.println("\t\tProcedure: " + p2.getProcedureName());
		System.out.println("\t\tProcedure Date: " + p2.getProcedureDate());
		System.out.println("\t\tPractitioner: " + p2.getDoctorName());
		System.out.println("\t\tCharges: " + p2.getCharges() + "\n");
		
		System.out.println("\t\tProcedure: " + p3.getProcedureName());
		System.out.println("\t\tProcedure Date: " + p3.getProcedureDate());
		System.out.println("\t\tPractitioner: " + p3.getDoctorName());
		System.out.println("\t\tCharges: " + p3.getCharges() + "\n");
		
		System.out.print("Total Charges: ");
		calculateTotalCharges(p1, p2, p3);
	}
	
	
	/*
	 * Displays all patient data
	 */
	static void displayPatient(Patient p)
	{
		System.out.println(p.toString());
	}
	
	/*
	 * Displays all procedure data
	 */
	static void displayProcedure(Procedure p)
	{
		System.out.println(p.toString());
	}
	
	/*
	 * Displays total price of procedures
	 */
	static void calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
	{
		
		double totalCost;
		totalCost = p1.getCharges() + p2.getCharges() + p3.getCharges();
		System.out.println(totalCost);
	}

}
