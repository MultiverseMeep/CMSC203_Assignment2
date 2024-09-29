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

public class Procedure {

	
	String procedureName;
	String procedureDate;
	String doctorName;
	double charges;
	
	
	/*
	 * Default no-arg constructor
	 */
	public  Procedure()
	{
		procedureName = "";
		procedureDate = "";
		doctorName = "";
		charges = 0.0;	
	}
	
	/*
	 * Constructor with just name and date
	 */
	public Procedure(String procedureName, String procedureDate) {
		 
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		
	}
	
	/*
	 * Constructor with all arguments
	 */
	public Procedure(String procedureName, String procedureDate, String doctorName, double charges) {
		 
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.doctorName = doctorName;
		this.charges = charges;
	}
	
	
	/*
	 * Mutators for all values
	 */
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public void setCharges(double charges) {
		this.charges= charges;
	}
	
	/*
	 * Accessors for all values
	 */
	public String getProcedureName() {
		return procedureName;
	}
	public String getProcedureDate() {
		return procedureDate;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public double getCharges() {
		return charges;
	}
	
	/*
	 * Returns a string with all procedure data
	 */
	public String toString()
	{
		return (getProcedureName() + ", " + getProcedureDate() + ", " + getDoctorName() + ", " + getCharges() + " ");
	}
	
}
