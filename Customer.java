
public class Customer {
	//Attributes
	String name;
	String telephonNumber;
	String emailAddress;
	String physicalAddress;
	
	//Methods
	
	public Customer(String name, String telephonNumber, String emailAddress, String physicalAddress) {
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
		String output = "Name of Customer: " +name;
		output+= "\nTelephone Number of Customer: " + telephonNumber;
		output += "\nEmail Address of Customer: " + emailAddress;
		output += "\nPhysical Address of Customer: " + physicalAddress;
		
		return output;
	}

}
