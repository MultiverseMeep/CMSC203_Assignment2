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


/**
 * Patient class, represents a Patient object
 * 
 *
 */
public class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
	private int phoneNumber;
	
	private String emergencyFirstName;
	private String emergencyLastName;
	private int emergencyPhoneNumber;
	
	
	 
	/**
	 * Default no-arg Constructor
	 */
	public  Patient ()
	{
		firstName = "";
		middleName = "";
		lastName = "";	
	}
	
	
	
	/**
	 * Constructor that takes data as input and sets them.
	 * @param firstName the first name of the patient
	 * @param middleName the middle name of the patient
	 * @param lastName the last name of the patient
	 */
	public Patient(String firstName, String middleName, String lastName) {
	 
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	/*
	 * Constructor for all attributes
	*/
	public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zipCode, int phoneNumber, String emergencyFirstName, String emergencyLastName, int emergencyPhoneNumber) {
		 
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyFirstName = emergencyFirstName;
		this.emergencyLastName = emergencyLastName;
		this.emergencyPhoneNumber = emergencyPhoneNumber;

	}
	
	
	

	/*
	 * Mutators for each attribute
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city= city;
	}
	public void setState(String state) {
		this.state= state;
	}
	public void setZipCode(String zipCode) {
		this.zipCode= zipCode;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber= phoneNumber;
	}
	public void setEmergencyFirstName(String emergencyFirstName) {
		this.emergencyFirstName = emergencyFirstName;
	}
	public void setEmergencyLastName(String emergencyLastName) {
		this.emergencyLastName = emergencyLastName;
	}
	public void setEmergencyPhoneNumber(int emergencyPhoneNumber) {
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}
		
	
	/*
	 * Accessors for each attribute
	 */
		public String getFirstName() {
			return firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public String getAddress() {
			return address;
		}
		public String getCity() {
			return city;
		}
		public String getState() {
			return state;
		}
		public String getZipCode() {
			return zipCode;
		}
		public int getPhoneNumber() {
			return phoneNumber;
		}
		public String getEmergencyFirstName() {
			return emergencyFirstName;
		}
		public String getEmergencyLastName() {
			return emergencyLastName;
		}
		public int getEmergencyPhoneNumber() {
			return emergencyPhoneNumber;
		}
		
		
		/*
		 * Build methods to display output
		 */
		public String buildFullName()
		{
			return (firstName + " " + middleName + " " + lastName);
		}
		public String buildAddress()
		{
			return (address + " " + city + " " + state + " " + zipCode);
		}
		public String buildEmergencyContact()
		{
			return (emergencyFirstName + " " + emergencyLastName + " " + Integer.toString(emergencyPhoneNumber));
		}
		
	/**
	 * Returns a string with relevant patient information
	 */
	public String toString() {
		return (buildFullName() + ", " + buildAddress() + ", " + buildEmergencyContact() + " ");
	}
}
