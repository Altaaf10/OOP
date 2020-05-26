
public class Contractor {
	//Attributes
	String name;
	String telephonNumber;
	String emailAddress;
	String physicalAddress;
	
	//Methods
	
	public Contractor(String name, String telephonNumber, String emailAddress, String physicalAddress) {
		this.name =name;
		this.telephonNumber = telephonNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTelephonNumber() {
		return telephonNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	
	public String toString() {
		String output = "Name of Contractor: " +name;
		output+= "\nTelephone Number of Contractor: " + telephonNumber;
		output += "\nEmail Address of Contractor: " + emailAddress;
		output += "\nPhysical Address of Contractor: " + physicalAddress;
		
		return output;
	}

}
