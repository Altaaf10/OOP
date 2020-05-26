
public class Architect {
	
	//Attributes
	String name;
	String telephonNumber;
	String emailAddress;
	String physicalAddress;
	
	//Methods
	
	public Architect(String name, String telephonNumber, String emailAddress, String physicalAddress) {
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
		String output = "Name of Architect: " +name;
		output+= "\nTelephone Number of Architect: " + telephonNumber;
		output += "\nEmail Address of Architect: " + emailAddress;
		output += "\nPhysical Address of Architect: " + physicalAddress;
		
		return output;
	}

}
